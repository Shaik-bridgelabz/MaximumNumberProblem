package com.bridgelabz;

import java.util.Arrays;

public class MaximumOfThree<E extends Comparable<E>> {
    E[] input;

    public MaximumOfThree() {

    }

    public MaximumOfThree(E[] input) {
        this.input=input;
    }

    public <E extends Comparable> E findMaxOfThree(E... input) {

        Arrays.sort(input);
        int maximumIndex=input.length-1;
        MaximumOfThree.printMax(input[maximumIndex]);
        return input[maximumIndex];
    }

    public static <E> void printMax(E maxResult) {
        System.out.println("Maximum among all input is: "+maxResult);
    }
}
