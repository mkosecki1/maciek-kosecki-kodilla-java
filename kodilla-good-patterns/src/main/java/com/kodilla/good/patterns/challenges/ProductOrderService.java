package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {
    public boolean order(User user, Product product, LocalDate orderDate){
       System.out.println(user.getUsername() + "has orderd " + product.getProductName() + " on date: " + orderDate);
       return true;
    }
}
