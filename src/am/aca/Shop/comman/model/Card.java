package am.aca.Shop.comman.model;

/**
 * Created by Armen on 9/5/2016.
 */
public class Card {
    private Integer cardID;
    CardType cardType;

    public Integer getCardID() {
        return cardID;
    }

    public void setCardID(Integer cardID) {
        this.cardID = cardID;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
