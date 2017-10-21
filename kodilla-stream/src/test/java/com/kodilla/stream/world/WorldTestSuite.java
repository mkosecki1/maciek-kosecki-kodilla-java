package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country("Poland", new BigDecimal("38000000"));
        Country country2 = new Country("Germany", new BigDecimal("80000000"));
        Country country3 = new Country("USA", new BigDecimal("320000000"));
        Country country4 = new Country("Canada", new BigDecimal("120000000"));
        Country country5 = new Country("China", new BigDecimal("1300000000"));
        Country country6 = new Country("Japan", new BigDecimal("120000000"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("North America");
        Continent continent3 = new Continent("Asia");

        //When
        continent1.addCountries(country1);
        continent1.addCountries(country2);
        continent2.addCountries(country3);
        continent2.addCountries(country4);
        continent3.addCountries(country5);
        continent3.addCountries(country6);

        World theWorld = new World();
        theWorld.addContinents(continent1);
        theWorld.addContinents(continent2);
        theWorld.addContinents(continent3);

        BigDecimal worldQuantity = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedWorldQuantity = BigDecimal.valueOf(1978000000);
        Assert.assertEquals(expectedWorldQuantity, worldQuantity);
    }
}
