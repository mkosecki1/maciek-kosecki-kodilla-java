package com.kodilla.good.patterns.challenges.Food2Door.delivery;

import com.kodilla.good.patterns.challenges.Food2Door.suppliers.Supplier;

public class DeliveryProcessor {
    public DeliveryDto deliver(DeliveryRequest deliveryRequest){
        Supplier supplier = deliveryRequest.getSupplier();
        supplier.process(deliveryRequest);
        return new DeliveryDto(deliveryRequest.getSupplier(), deliveryRequest.getProduct(),true);
    }
}
