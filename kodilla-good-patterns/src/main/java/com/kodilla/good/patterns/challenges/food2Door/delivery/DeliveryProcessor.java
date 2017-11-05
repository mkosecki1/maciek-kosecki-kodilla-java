package com.kodilla.good.patterns.challenges.food2Door.delivery;

import com.kodilla.good.patterns.challenges.food2Door.suppliers.Supplier;

public class DeliveryProcessor {
    public DeliveryDto deliver(DeliveryRequest deliveryRequest){
        Supplier supplier = deliveryRequest.getSupplier();
        supplier.process(deliveryRequest);
        return new DeliveryDto(deliveryRequest.getSupplier(), deliveryRequest.getProduct(),true);
    }
}
