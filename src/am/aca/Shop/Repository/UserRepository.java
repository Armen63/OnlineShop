package am.aca.Shop.Repository;

import am.aca.Shop.comman.model.User;

/**
 * Created by Armen on 9/5/2016.
 */
public interface UserRepository {
    boolean verifyLogin(User user);

}
