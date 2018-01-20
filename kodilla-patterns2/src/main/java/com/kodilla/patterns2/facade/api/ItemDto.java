package com.kodilla.patterns2.facade.api;

public final class ItemDto {
    private final Long productId;
    private final double qantity;

    public ItemDto(Long productId, double qantity) {
        this.productId = productId;
        this.qantity = qantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQantity() {
        return qantity;
    }
}
