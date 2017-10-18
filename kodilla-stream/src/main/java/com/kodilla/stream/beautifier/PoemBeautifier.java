package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String thePoem, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(thePoem);
        System.out.println(result);
    }
}
