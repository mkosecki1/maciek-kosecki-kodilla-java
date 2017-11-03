package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.challengeTwo.*;

public class Application {
    public  static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationProductSeviceProduct(), new ProductOrderService(), new OrderProductRepository());
        orderProcessor.process(orderRequest);
    }
}
