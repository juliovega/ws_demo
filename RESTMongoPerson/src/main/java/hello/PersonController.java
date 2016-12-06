package hello;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author avega
 */
@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;
    
    @RequestMapping(method= RequestMethod.GET,value= "/persons")
    public String getPersons() {
        List<Person> persons = personRepository.findAll();
        String personsToString = "";
        for (Person p : persons) {
            personsToString += p.toString()+"<br>";
        }
        return personsToString;
    }
    
    @RequestMapping(method= RequestMethod.POST,value="/person")
    public String getPerson(@RequestParam(value="name")String name){
        Person p= personRepository.findByName(name);
        if(p==null){
            return "no se encontró "+name;
        }
        return p.toString();
    }

    @RequestMapping("/savePerson")
    public String savePerson(@RequestParam(value = "name", defaultValue = "sinNombre") String name,
            @RequestParam(value = "age", defaultValue = "-1") int age) {
        Person person = personRepository.findByNameAndAge(name,age);
        if(person==null){
            person=new Person(name, age);
        }
        return personRepository.save(person).toString();
    }
    
    @RequestMapping(method = RequestMethod.POST,value="/savePersonJSON")
    public String savePersonJSON(@RequestBody Person p){
        return "saving JSON person" +personRepository.save(p).toString();        
    }
 
     
    @RequestMapping(method = RequestMethod.POST,value="/savePersonParsingJSON")
    public String savePersonJSON(@RequestBody Map<String,Object> p){
        Person person=new Person();
        Object tmp=p.get("name");
        if(tmp instanceof String){
            person.setName((String)tmp);
        }else{
            person=null;
        }
        if(person==null){
            return "faltan parametros";
        }
        tmp=p.get("age");
        person.setAge((Integer)tmp);
        return "saving JSON person parsed" +personRepository.save(
                person).toString();        
    }
    
    
    @RequestMapping("/modify")
    public String modifyPerson(Person p,@RequestParam(value ="ageM") int age){
        p.setAge(age);
        personRepository.save(p);
        return p.toString();
    }
}
