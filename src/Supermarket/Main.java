package Supermarket;

import Supermarket.model.Product;
import Supermarket.services.productServiceImpl;


public class Main {
    public static void main(String[] args) {

        productServiceImpl productService = new productServiceImpl();

        productService.addProduct(new Product(1, "milk", 2500F, 4));
        productService.addProduct(new Product(2, "eggs", 500F, 40));
        productService.addProduct(new Product(3, "rice", 3500F, 6));

        productService.sellProduct(2,2);

        productService.listProducts();


    }
}
