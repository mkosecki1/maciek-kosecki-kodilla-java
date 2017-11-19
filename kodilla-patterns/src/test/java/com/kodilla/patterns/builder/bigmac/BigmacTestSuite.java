package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setRoll("z sezamem")
                .setBurger("2")
                .setSauce("czosnkowy")
                .setIngredient("cebula")
                .setIngredient("bekon")
                .setIngredient("ser")
                .setIngredient("pieczarki")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4,howManyIngredients);
        Assert.assertEquals("z sezamem",bigmac.getRoll());
        Assert.assertNotNull(bigmac.getBurgers());
        Assert.assertNotEquals("100 wysp",bigmac.getSauce());
    }
}
