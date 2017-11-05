package com.kodilla.good.patterns.challenges.challengeTwo.order;

import com.kodilla.good.patterns.challenges.challengeTwo.attributes.Product;
import com.kodilla.good.patterns.challenges.challengeTwo.attributes.User;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime orderDate;

    public OrderRequest(final User user, final Product product, final LocalDateTime orderDate) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
