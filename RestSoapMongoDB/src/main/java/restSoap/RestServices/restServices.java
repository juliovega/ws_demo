/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restSoap.RestServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import restSoap.stubs.UserP;

/**
 *
 * @author avega
 */
@Component("restServices")
public class restServices implements UserP {

    @Autowired
    UserRepositories uRep;

    @Override
    public int validateUserAndPass(@RequestParam(value= "user") String user, @RequestParam(value="password")String password) {
        User u= uRep.findByUserAndPassword(user, password);
        return u.getId();
    }
}
