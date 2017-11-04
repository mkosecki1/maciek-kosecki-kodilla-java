package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.delivery.DeliveryRequest;

public class HealthyShop implements Supplier {
    private String name = "HealthyShop";
    private String regon = "12122112";

    @Override
    public String toString() {
        return name + " (regon='" + regon + '\'' + ')';
    }

    @Override
    public void process(DeliveryRequest deliveryRequest) {
        System.out.println(toString() + " delivery is comming");
    }
}
