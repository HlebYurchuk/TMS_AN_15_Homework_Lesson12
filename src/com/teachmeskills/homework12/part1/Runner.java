package com.teachmeskills.homework12.part1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Runner implements IPassports {


    public static void main (String[]args){


    Client client1 = new Client("22.05.2023", "Пётр", 58 );
    Client client2 = new Client("05.03.2019", "Вася", 24 );
    Client client3 = new Client("15.05.2021", "Евгений", 32 );

            Product product1 = new Product(3, "MP123456", "Картошка, красивая");
            Product product2 = new Product(5, "AP1231245", "Арбуз, сочный");
            Product product3 = new Product(98, "B312456", "Банан, зелёный, не вкусный");
            Product product4 = new Product(12, "P124124", "Персик");


        client1.addProduct(product1);
        client2.addProduct(product2);
        client3.addProduct(product3);
        client1.addProduct(product4);

            Map<String, Client> map = new HashMap<>();
            map.put(NO_PASSWORD1, client1);
            map.put(NO_PASSWORD2, client2);
            map.put(NO_PASSWORD3, client3);

        for (Map.Entry<String, Client> client : map.entrySet()) {
            System.out.println("Номер паспорта " + client.getKey() + "\n" + client.getValue());
            System.out.println();
        }
            Iterator<Map.Entry<String, Client>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Client> myEntry = iterator.next();
            System.out.println(myEntry.getKey() + "->" + myEntry.getValue());
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        }
    }
