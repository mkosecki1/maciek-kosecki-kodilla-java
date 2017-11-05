package com.kodilla.good.patterns.challenges.Food2Door.attributes;

public class Products {
    private final String productName;
    private final int productQuantity;

    public Products(final String productName, final int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}