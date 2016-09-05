package am.aca.Shop.comman.model;

/**
 * Created by Armen on 9/5/2016.
 */
public enum TypeNumber {
    HOME(1),
    MOBILE(2);
    private int ID;

    private int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    TypeNumber(int ID) {
        this.ID = ID;

    }
}
