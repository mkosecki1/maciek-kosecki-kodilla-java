package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.delivery.DeliveryRequest;

public interface Supplier {
    void process(DeliveryRequest deliveryRequest);
}
