package am.aca.Shop.comman.model;

/**
 * Created by Armen on 9/5/2016.
 */
public enum TypeProduct {
    TSHIRT(1),
    SHIRT(2),
    TROUSER(3),
    SHOES(4);
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    TypeProduct(int ID){
        this.ID = ID;
    }
}
