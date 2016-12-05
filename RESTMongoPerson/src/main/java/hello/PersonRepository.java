/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author avega
 */
public interface PersonRepository extends MongoRepository<Person, Serializable>{
    public Person findByName(String name);
    public Person findByNameAndAge(String name,int age);
    public List<Person> findByAge(int age);
}
