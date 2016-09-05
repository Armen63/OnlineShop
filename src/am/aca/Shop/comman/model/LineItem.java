package am.aca.Shop.comman.model;

/**
 * Created by Armen on 9/5/2016.
 */
public class LineItem {
    private Integer price;
    private Integer quantity;
    private Integer salesPrice;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }


}
