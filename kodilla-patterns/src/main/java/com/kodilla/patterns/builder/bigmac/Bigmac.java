package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final String burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private String burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder setRoll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder setBurger(String burgers) {
            this.burgers = burgers;
            return  this;
        }

        public BigmacBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return  this;
        }

        public BigmacBuilder setIngredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(roll,burgers,sauce,ingredients);
        }
    }

    private Bigmac(final String roll,final String burgers,final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
