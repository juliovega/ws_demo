/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restSoap.RestServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restSoap.stubs.UserImplService;
import restSoap.stubs.UserP;

/**
 *
 * @author avega
 */
@RestController
public class UserController {
    @Autowired
    UserImplService uService;
    
    @RequestMapping("/getId")
    public int getId(@RequestParam(value="user")String user,@RequestParam(value="password")String password){
        UserP userP = uService.getUserImplPort();
        return userP.validateUserAndPass(user, password);
    }
    
    /*@RequestMapping("/insertUser")
    public String insertUser(@RequestParam(value="user") User user){
        UserP userP=uService.getUserImplPort();
        if(userP.addUser(user)){
            return "se agregó al usuario: "+user.toString();
        }else{
            return "no se pudo agregar al usuario";
        }
    }*/
    
    
    
}
