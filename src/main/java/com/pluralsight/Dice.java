package com.pluralsight;

public class Dice {

    public int roll() {
        // maxValue would be 6, minValue would be 1
        return (int) (Math.random() * 6) + 1;
    }
}
