package Supermarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Supermarket {

    //initializing

    private ArrayList<Product> products;
    private HashSet<Product> favoriteProducts;
    private HashMap<String, ArrayList<Product>> groups;

    public Supermarket(){
        //initializing
        this.products = new ArrayList<>();
        favoriteProducts = new HashSet<>();
        this.groups = new HashMap<>();
    }

    public void registerProduct(Product product){
        products.add(product);
    }

    public String toString(){
        String information = this.products.toString();
        return information;
    }
}
