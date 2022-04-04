package Supermarket.services;

import Supermarket.model.Product;

public interface productService {

    void addProduct(Product product);

    Integer getProduct(Integer id);

    void listProducts();

    void sellProduct(Integer quantity, Integer productId);

}
