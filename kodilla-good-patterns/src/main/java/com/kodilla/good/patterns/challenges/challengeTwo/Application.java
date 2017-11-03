package com.kodilla.good.patterns.challenges.challengeTwo;

import com.kodilla.good.patterns.challenges.challengeTwo.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.challengeTwo.order.OrderRequest;
import com.kodilla.good.patterns.challenges.challengeTwo.order.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.challengeTwo.repository.OrderProductRepository;
import com.kodilla.good.patterns.challenges.challengeTwo.service.InformationProductService;
import com.kodilla.good.patterns.challenges.challengeTwo.service.ProductOrderService;

public class Application {
    public  static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationProductService(), new ProductOrderService(), new OrderProductRepository());
        orderProcessor.process(orderRequest);
    }
}
