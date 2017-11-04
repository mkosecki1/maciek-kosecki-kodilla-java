package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.attributes.Products;
import com.kodilla.good.patterns.challenges.Food2Door.delivery.DeliveryProcessor;
import com.kodilla.good.patterns.challenges.Food2Door.delivery.DeliveryRequest;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.HealthyShop;

public class Application {
    public static void main(String[] args){
        DeliveryRequest deliveryRequest = new DeliveryRequest(new ExtraFoodShop(), new Products("Tomato",10));
        DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
        deliveryProcessor.deliver(deliveryRequest);

        DeliveryRequest deliveryRequest2 = new DeliveryRequest(new GlutenFreeShop(), new Products("ss",1));
        DeliveryProcessor deliveryProcessor2 = new DeliveryProcessor();
        deliveryProcessor2.deliver(deliveryRequest2);

        DeliveryRequest deliveryRequest3 = new DeliveryRequest(new HealthyShop(), new Products("ss",1));
        DeliveryProcessor deliveryProcessor3 = new DeliveryProcessor();
        deliveryProcessor3.deliver(deliveryRequest3);
    }
}
