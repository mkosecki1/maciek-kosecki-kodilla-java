package com.kodilla.good.patterns.challenges.challengeTwo.order;

import com.kodilla.good.patterns.challenges.challengeTwo.repository.OrderProductRepository;
import com.kodilla.good.patterns.challenges.challengeTwo.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.challengeTwo.service.InformationService;
import com.kodilla.good.patterns.challenges.challengeTwo.service.ProductOrderService;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService orderService;
    private OrderProductRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService orderService, final OrderProductRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

   public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());

        if(isOrdered) {
            informationService.sendInformation(orderRequest.getUser());
            orderRepository.takeOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
