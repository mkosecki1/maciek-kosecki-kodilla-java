package com.kodilla.good.patterns.challenges.food2Door.suppliers;

import com.kodilla.good.patterns.challenges.food2Door.delivery.DeliveryRequest;

public class HealthyShop implements Supplier {
    private final static String name = "HealthyShop";
    private final static String regon = "12122112";

    @Override
    public String toString() {
        return name + " (REGON: " + regon + ')';
    }

    @Override
    public void process(DeliveryRequest deliveryRequest) {
        System.out.println(toString() + " delivery is comming");
    }
}
