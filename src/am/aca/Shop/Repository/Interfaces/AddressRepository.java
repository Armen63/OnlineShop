package am.aca.Shop.Repository.Interfaces;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Address;

/**
 * Created by Armen on 9/5/2016.
 */
public interface AddressRepository{
    Address addAddress(Address address)throws InvalidCommandException;
    void deleteAddress(Integer id)throws InvalidCommandException;
    Address editAddress(Address address)throws InvalidCommandException;
    boolean availableToThatCountry(Address country)throws InvalidCommandException;
}
