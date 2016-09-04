package am.aca.Shop.comman.model;

/**
 * Created by Armen on 9/5/2016.
 */
public enum CardType {
    MASTER(1),
    VISA(2),
    MAESTRO(3);
    private Integer ID;
    CardType(int ID) {
        this.ID = ID;
    }
}
