/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.Bean.Employee;
import java.util.List;

/**
 *
 * @author avega
 */
public interface EmployeeDao {
    public void create(Employee employee);
    
    public void update(Employee employee);
    
    public int deleteById(int id);
    
    public Employee findById(int id);
   
    public List<Employee> findAll();
}
