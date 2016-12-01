/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.Bean.Employee;
import com.mongodb.WriteResult;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 *
 * @author avega
 */
public class EmployeeDaoImpl implements EmployeeDao{

    public static final String COLLECTION="Employee";
    @Autowired
    MongoTemplate mongoTemplate;
    
    @Override
    public void create(Employee employee) {
        if(employee!=null){
            this.mongoTemplate.insert(employee,COLLECTION);
        }
    }
    

    @Override
    public void update(Employee employee) {
        if(employee!=null){
            mongoTemplate.save(employee,COLLECTION);
        }
    }

    @Override
    public int deleteById(int id) {
        Query query=new Query(Criteria.where("_id").is(id));
        WriteResult result= mongoTemplate.remove(query, Employee.class, COLLECTION);
        return result.getN();
    }

    @Override
    public Employee findById(int id) {
        Query query=new Query(Criteria.where("_id").is(id));
        return this.mongoTemplate.findOne(query, Employee.class,COLLECTION);
    }

    @Override
    public List findAll() {
        return  mongoTemplate.findAll(Employee.class,COLLECTION);
    }
    
}
