/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restSoap.RestServices;

import org.springframework.data.annotation.Id;

/**
 *
 * @author avega
 */
public class User {
    @Id
    private int id;

    private String user;
    private String password;
    private String email;
    
    public User(){
        
    }
    
    public User(int id,String user,String password,String email){
        this.id=id;
        this.user=user;
        this.password=password;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
