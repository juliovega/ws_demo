/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.Bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author avega
 */
@Document
public class Employee {
    @Id
    private int id;
    
    private String firstName;
    private String lastName;
    
    public Employee(){}
    
    public Employee(int id,String firstName,String lastName){
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString(){
        StringBuilder employee=new StringBuilder();
        employee.append("Employee ID:-").append(this.getId()).append("\n");
        employee.append("First Name:-").append(this.getFirstName()).append("\n");
        employee.append("Last Name:-").append(this.getLastName()).append("\n");
        return employee.toString();
    }
    
}
