/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    private static String saludo;
    private final AtomicInteger counter = new AtomicInteger();
    
    @RequestMapping("/persons")
    public String getPersons() {
        List<Person> persons = personRepository.findAll();
        String personsToString = "";
        for (Person p : persons) {
            personsToString += p.toString()+"\n";
        }
        return personsToString;
    }
    
    @RequestMapping("/person")
    public String getPerson(@RequestParam(value="name")String name){
        Person p= personRepository.findByName(name);
        if(p==null){
            return "no se encontró "+name;
        }
        return p.toString();
    }

    @RequestMapping("/savePerson")
    public String savePerson(@RequestParam(value = "name", defaultValue = "sinNombre") String name,
            @RequestParam(value = "edad", defaultValue = "-1") int age) {
        Person person = personRepository.findByNameAndAge(name,age);
        if(person==null){
            person=new Person(name, age);
        }
        return personRepository.save(person).toString();
    }
}
