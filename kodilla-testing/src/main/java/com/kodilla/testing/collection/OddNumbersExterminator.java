package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers){
        int tempValue = 0;
        for (int i=0; i<numbers.size(); i++){
            tempValue = numbers.get(i);
            if (tempValue % 2 == 0){
                System.out.println(tempValue);
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> mainList = new ArrayList<Integer>();
            for (int n = 0; n < 1; n++) {
            mainList.add(0);
            mainList.add(1);
            mainList.add(2);
            mainList.add(3);
            mainList.add(4);
            mainList.add(5);
            mainList.add(6);
            mainList.add(7);
            mainList.add(8);
            mainList.add(9);
        }
        OddNumbersExterminator throwOdd = new OddNumbersExterminator();
        throwOdd.exterminate(mainList);
        System.out.println("get:" + mainList.get(2));

    }

}
