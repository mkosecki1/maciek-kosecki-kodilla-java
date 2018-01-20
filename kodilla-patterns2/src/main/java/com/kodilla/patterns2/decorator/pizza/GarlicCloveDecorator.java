package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GarlicCloveDecorator extends AbstractPizzaOrderDecorator{
    public GarlicCloveDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(1.50));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", garlic clove";
    }
}
