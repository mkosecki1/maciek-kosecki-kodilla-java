package com.kodilla.good.patterns.challenges.food2Door.suppliers;

import com.kodilla.good.patterns.challenges.food2Door.delivery.DeliveryRequest;

public class ExtraFoodShop implements Supplier {
    @Override
    public void process(DeliveryRequest deliveryRequest) {
        System.out.println("ExtraFoodShop delivery in progres.");
    }
}
