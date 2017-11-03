package com.kodilla.good.patterns.challenges.challengeTwo;

public class OrderProcessor {
    private InformationProductSevice informationProductSevice;
    private ProductOrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationProductSevice informationProductSevice,
                          final ProductOrderService orderService, final OrderRepository orderRepository) {
        this.informationProductSevice = informationProductSevice;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

   public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());

        if(isOrdered) {
            informationProductSevice.sendInformation(orderRequest.getUser());
            orderRepository.takeOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
