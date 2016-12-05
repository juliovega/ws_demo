/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
}
