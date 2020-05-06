package com.bridgelabz;

public class MaximumOfThree<E extends Comparable<E>> {
    E firstInput;
    E secondInput;
    E thirdInput;

    public MaximumOfThree() {

    }
    
    public MaximumOfThree(E firstInput, E secondInput, E thirdInput) {
        this.firstInput=firstInput;
        this.secondInput=secondInput;
        this.thirdInput=thirdInput;
    }

    public <E extends Comparable> E findMaxOfThree(E firstInput, E secondInput, E thirdInput) {

        E maximum=firstInput;
        if (secondInput.compareTo(maximum) > 0 )
            maximum=secondInput;
        if ( thirdInput.compareTo(maximum) > 0 )
            maximum=thirdInput;

        return maximum;
    }

}
