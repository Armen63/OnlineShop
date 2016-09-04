package am.aca.Shop.comman.model;

/**
 * Created by Armen on 9/5/2016.
 */
public class Product {
    private String productName;
    TypeProduct typeProduct;
    private Integer productID;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }
}
