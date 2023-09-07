package com.teachmeskills.homework12.part1;

import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String dateRegistration;
    private String name;
    private int age;
    private ArrayList<Product> arrayList = new ArrayList<>();


    public Client(String dateRegistration, String name, int age) {
        this.dateRegistration = dateRegistration;
        this.name = name;
        this.age = age;
    }

    public void addProduct(Product orders){
        arrayList.add(orders);
        System.out.println(arrayList);
    }

    @Override
    public String toString() {
        return "Client{" +
                "dateRegistration=" + dateRegistration +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
