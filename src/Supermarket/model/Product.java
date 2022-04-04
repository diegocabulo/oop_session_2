package Supermarket.model;

public class Product {
    private Integer id;
    private String name;
    private Float price;
    private Integer quantity;

    public Product(Integer id, String name, Float price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Product: " + getName() +"\n"+"Price: " + getPrice() +"\n"+ "Quantity: " + getQuantity() +"\n";
    }
}
