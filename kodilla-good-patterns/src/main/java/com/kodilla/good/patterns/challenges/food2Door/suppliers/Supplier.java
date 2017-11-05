package com.kodilla.good.patterns.challenges.food2Door.suppliers;

import com.kodilla.good.patterns.challenges.food2Door.delivery.DeliveryRequest;

public interface Supplier {
    void process(DeliveryRequest deliveryRequest);
}
