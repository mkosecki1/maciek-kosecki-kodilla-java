package com.kodilla.patterns2.decorator.taxiportal;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        //When
        BigDecimal calculatedCost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(5),calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course",description);
    }

    @Test
    public void testTaxiNetworkGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //When
        BigDecimal theCost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(40),theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network",description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        BigDecimal theCost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(37),theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat",description);
    }

    @Test
    public void testUberWithTwoChildSeatsGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        BigDecimal theCost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(29),theCost);

    }

    @Test
    public void testUberWithTwoChildSeatsGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course by Uber Network + child seat + child seat",description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ExpressDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());

        //When
        BigDecimal theCost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(57),theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ExpressDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        System.out.println(taxiOrder.getDescription());

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network express service + child seat variant VIP",description);

    }
}
