package tania.com.fragment;

public class ProductItem {

    private String productname;
    private String productPrice;

    public ProductItem(String productname, String productPrice) {
        this.productname = productname;
        this.productPrice = productPrice;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductPrice() {
        return productPrice;
    }
}
