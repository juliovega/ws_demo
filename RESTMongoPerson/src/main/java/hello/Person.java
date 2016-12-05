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
    private String id;
    
    private String name;
    private int age;
    
    public Person(){
    
    }
    
    public Person(String name,int edad){
        this.name=name;
        this.age=edad;
    }

    Person(String incrementAndGet, String name, int edad) {
        this.id=incrementAndGet;
        this.name=name;
        this.age=edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "id: "+id+ " name: "+name+" age: "+age;
    }
}
