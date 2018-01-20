package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal getPrice = pizzaOrder.getPizzaPrice();

        //Then
        System.out.println("Pizza price: " + pizzaOrder.getPizzaPrice());
        assertEquals(new BigDecimal(15),getPrice);
    }

    @Test
    public void testBasicPizzaOrderDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String getDescription = pizzaOrder.getPizzaDescription();

        //Then
        System.out.println("Pizza description: " + pizzaOrder.getPizzaDescription());
        assertEquals("You ordered a pizza that contains ingredients: dough, tomato sauce, cheese",getDescription);
    }
    @Test
    public void testHamDecorator(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);

        //When
        BigDecimal getPrice = pizzaOrder.getPizzaPrice();
        String getDescription = pizzaOrder.getPizzaDescription();

        //Then
        System.out.println("Pizza price: " + pizzaOrder.getPizzaPrice());
        System.out.println("Pizza description: " + pizzaOrder.getPizzaDescription());
        assertEquals(new BigDecimal(17),getPrice);
        assertEquals("You ordered a pizza that contains ingredients: dough, tomato sauce, cheese, ham",getDescription);
    }

    @Test
    public void testCapricciosaDecorator(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapricciosaDecorator(pizzaOrder);

        //When
        BigDecimal getPrice = pizzaOrder.getPizzaPrice();
        String getDescription = pizzaOrder.getPizzaDescription();

        //Then
        System.out.println("Pizza price: " + pizzaOrder.getPizzaPrice());
        System.out.println("Pizza description: " + pizzaOrder.getPizzaDescription());
        assertEquals(new BigDecimal(26),getPrice);
        assertEquals("You ordered a pizza that contains ingredients: dough, tomato sauce, cheese," +
                " ham, mushrooms, mozzarella and artichokes",getDescription);
    }

    @Test
    public void testManyIngredientsDecorator(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AnchoviesDecorator(pizzaOrder);
        pizzaOrder = new GarlicCloveDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);

        //When
        BigDecimal getPrice = pizzaOrder.getPizzaPrice();
        String getDescription = pizzaOrder.getPizzaDescription();

        //Then
        System.out.println("Pizza price: " + pizzaOrder.getPizzaPrice());
        System.out.println("Pizza description: " + pizzaOrder.getPizzaDescription());
        assertEquals(new BigDecimal(21.50),getPrice);
        assertEquals("You ordered a pizza that contains ingredients: dough, tomato sauce, cheese, " +
                "anchovies, garlic clove, ham",getDescription);
    }

}
