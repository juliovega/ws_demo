/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.springframework.data.annotation.Id;

/**
 *
 * @author avega
 */
public class Person {
    @Id
    private int id;
    
    private String name;
    private int age;
    
    public Person(){
    
    }
    
    public Person(String name,int edad){
        this.name=name;
        this.age=edad;
    }

    Person(int incrementAndGet, String name, int edad) {
        this.id=incrementAndGet;
        this.name=name;
        this.age=edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "name: "+name+" age: "+age;
    }
}
