package com.kodilla.good.patterns.challenges.food2Door.suppliers;

import com.kodilla.good.patterns.challenges.food2Door.delivery.DeliveryRequest;

public class GlutenFreeShop implements Supplier {
    private static final String supplierName = "GlutenFreeShop";

    @Override
    public void process(DeliveryRequest deliveryRequest) {
        System.out.println(getSupplierName() + " will deliver products.");
    }

    public static String getSupplierName() {
        return supplierName;
    }
}
