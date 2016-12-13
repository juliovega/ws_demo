package restSoap.RestServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import restSoap.stubs.UserP;

/**
 *
 * @author avega
 */
@Component("UserService")
public class UserService implements UserP {

    @Autowired
    UserRepositories uRep;

    @Override
    public int validateUserAndPass(@RequestParam(value = "user") String user,
            @RequestParam(value = "password") String password) {
        User u = uRep.findByUserAndPassword(user, password);
        if (u == null) {
            return -1;
        } else {
            return u.getId();
        }
    }

}
