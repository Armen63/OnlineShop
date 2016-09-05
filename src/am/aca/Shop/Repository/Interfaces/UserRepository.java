package am.aca.Shop.Repository.Interfaces;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.User;

/**
 * Created by Armen on 9/5/2016.
 */
public interface UserRepository {
    User addUser(User user) throws InvalidCommandException;
    User editUser(User user)throws InvalidCommandException;
    void deleteUser(Integer id) throws InvalidCommandException;
    boolean verifyLogin(User user);

}
