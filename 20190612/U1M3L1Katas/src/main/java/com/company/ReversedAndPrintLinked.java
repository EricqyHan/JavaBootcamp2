package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReversedAndPrintLinked {
    public static void main(String[] args) {

        int [] numbers = {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43};

        System.out.println("--------------");
        System.out.println("Normal");
        System.out.println("--------------");

        LinkedList<Integer> numberList = new LinkedList<Integer>();

        for(int element : numbers) {
            System.out.println(element);
            numberList.add(element);
        }

        int[] reversed = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length-(i+1)];
        }

        System.out.println("--------------");
        System.out.println("Reversed");
        System.out.println("--------------");

        for(int element : reversed) {
            System.out.println(element);
            numberList.add(element);
        }
    }
}
