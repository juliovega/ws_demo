package restSoap.RestServices;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author avega
 */
public interface UserRepositories extends MongoRepository<User,String> {
    public User findByUserAndPassword(String user,String password);
    public User findByUser(String user);
    public User findByEmail(String email);
}
