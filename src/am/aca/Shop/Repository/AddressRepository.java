package am.aca.Shop.Repository;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Address;

/**
 * Created by Armen on 9/5/2016.
 */
public interface AddressRepository {
    boolean availableToThatCountry(Address country)throws InvalidCommandException;
}
