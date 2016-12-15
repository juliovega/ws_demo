package restSoap.RestServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import restSoap.stubs.UserPort;
import restSoap.stubs.UserRequest;
import restSoap.stubs.ValidateUserAndPassResponse;

/**
 *
 * @author avega
 */
@Component("UserService")
public class UserService implements UserPort {

    @Autowired
    UserRepositories uRep;

    @Override
    public ValidateUserAndPassResponse validateUserAndPass(UserRequest parameters) {
        User user=uRep.findByUserAndPassword(parameters.getUsername(), parameters.getPassword());
        ValidateUserAndPassResponse vResp=new ValidateUserAndPassResponse();
        vResp.setId(user==null?-1:user.getId());
        return vResp;
    }

    public ValidateUserAndPassResponse validateUserAndPass(String user, String password) {
        UserRequest u = new UserRequest();
        u.setUsername(user);
        u.setPassword(password);
        return validateUserAndPass(u);
        
    }

}
