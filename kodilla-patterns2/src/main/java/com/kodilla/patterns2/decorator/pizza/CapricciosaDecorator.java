package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CapricciosaDecorator extends AbstractPizzaOrderDecorator {
    public CapricciosaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice() {
        return super.getPizzaPrice().add(new BigDecimal(11));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", ham, mushrooms, mozzarella and artichokes";
    }
}
