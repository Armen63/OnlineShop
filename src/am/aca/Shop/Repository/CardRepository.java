package am.aca.Shop.Repository;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Card;
import am.aca.Shop.comman.model.Order;
import am.aca.Shop.comman.model.Product;

import java.util.List;

/**
 * Created by Armen on 9/5/2016.
 */
public interface CardRepository {

    boolean hasBallance(Card card) throws InvalidCommandException;
    List<Order> shoppingItems(Product id)throws  InvalidCommandException;
    Card updateBallance(Order order) throws InvalidCommandException;
}
