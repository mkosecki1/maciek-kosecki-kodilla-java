package com.kodilla.good.patterns.challenges.food2Door.delivery;

import com.kodilla.good.patterns.challenges.food2Door.attributes.Products;
import com.kodilla.good.patterns.challenges.food2Door.suppliers.Supplier;

public class DeliveryDto {
    private Supplier supplier;
    private Products products;
    private boolean isDelivered;

    public DeliveryDto(Supplier supplier, Products products, boolean isDelivered) {
        this.supplier = supplier;
        this.products = products;
        this.isDelivered = isDelivered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Products getProduct() {
        return products;
    }

    public boolean isDelivered() {
        return isDelivered;
    }
}
