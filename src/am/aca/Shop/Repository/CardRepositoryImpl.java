package am.aca.Shop.Repository;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Card;
import am.aca.Shop.comman.model.Order;
import am.aca.Shop.comman.model.Product;

import java.util.List;

/**
 * Created by Armen on 9/5/2016.
 */
public class CardRepositoryImpl implements CardRepository {
    @Override
    public boolean hasBallance(Card card) throws InvalidCommandException {
        return false;
    }

    @Override
    public List<Order> shoppingItems(Product id) throws InvalidCommandException {
        return null;
    }
}
