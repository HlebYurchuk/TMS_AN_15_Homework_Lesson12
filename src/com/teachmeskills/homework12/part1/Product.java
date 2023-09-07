package com.teachmeskills.homework12.part1;

public class Product {
    public double price;
    public String id;
    public String description;

    public Product(double price, String id, String description) {
        this.price = price;
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
