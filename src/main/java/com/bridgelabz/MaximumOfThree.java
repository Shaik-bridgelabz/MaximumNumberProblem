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
        return input[maximumIndex];
    }

}
