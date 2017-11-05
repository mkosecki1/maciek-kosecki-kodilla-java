package com.kodilla.good.patterns.challenges.food2Door.delivery;

import com.kodilla.good.patterns.challenges.food2Door.attributes.Products;
import com.kodilla.good.patterns.challenges.food2Door.suppliers.Supplier;

public class DeliveryRequest {
    private final Supplier supplier;
    private final Products products;

    public DeliveryRequest(final Supplier supplier, final Products products) {
        this.supplier = supplier;
        this.products = products;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Products getProduct() {
        return products;
    }

}
