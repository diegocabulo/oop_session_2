package Supermarket.services;

import Supermarket.model.Product;

import java.util.ArrayList;
import java.util.Objects;

public class productServiceImpl implements productService{

    private final ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Integer getProduct(Integer productId) {
        for (Product product:products) {
            if(product.getId().equals(productId)) {
                return products.indexOf(product);
            }
        }
        return null;
    }

    @Override
    public void listProducts() {
        for (Product product:products) {
            System.out.println(product);
        }
    }

    @Override
    public void sellProduct(Integer quantity, Integer productId) {
        Integer indexProduct = getProduct(productId);
        if(Objects.nonNull(indexProduct)){
            Product product = products.get(indexProduct);
            if(product.getQuantity() > quantity){
                Integer total = product.getQuantity() - quantity;
                product.setQuantity(total);
                System.out.println("You sell: "+ quantity + " products");
            }else {
                System.out.println("Not enough products in stock");
            }
            return;
        }
        System.out.println("The product does not exist in inventory");
    }

}
