package ua.artcode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 22.02.15.
 */
public class Bucket {

    private int id;
    private List<Product> productList;

    public Bucket() {
        productList = new ArrayList<>();
    }

    public void addTo(Product product){
        productList.add(product);
    }

    public void remove(Product product){
        productList.remove(product);
    }

    public int getId() {
        return id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
