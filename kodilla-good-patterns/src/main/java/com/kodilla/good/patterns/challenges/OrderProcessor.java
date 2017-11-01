package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

   public OrderDto process(final RentRequest rentRequest) {
        boolean isOrdered = orderService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if(isRented) {
            informationService.inform(rentRequest.getUser());
            orderRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
