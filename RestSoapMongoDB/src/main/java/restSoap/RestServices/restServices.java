/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restSoap.RestServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import restSoap.stubs.UserPort;
import restSoap.stubs.UserRequest;
import restSoap.stubs.ValidateUserAndPassResponse;

/**
 *
 * @author avega
 */
@Component("restServices")
public class restServices implements UserPort {

    @Autowired
    UserRepositories uRep;

    public int validateUserAndPass(@RequestParam(value= "user") String user, @RequestParam(value="password")String password) {
        UserRequest uReq=new UserRequest();
        uReq.setUsername(user);
        uReq.setPassword(password);
        return validateUserAndPass(uReq).getId();
    }

    @Override
    public ValidateUserAndPassResponse validateUserAndPass(UserRequest parameters) {
        User u= uRep.findByUserAndPassword(parameters.getUsername(), parameters.getPassword());
        ValidateUserAndPassResponse validateResponse= new ValidateUserAndPassResponse();
        validateResponse.setId(u.getId());
        return validateResponse;
    }
}
