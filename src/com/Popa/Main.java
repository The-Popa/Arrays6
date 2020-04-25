package com.Popa;

public class Main {

    public static void main(String[] args) {

        double[] valueArray = {43, 5, 23, 17, 2 ,14};
        double sum = 0.0;

        for (double number: valueArray) {
            sum += number;
        }

        double average = sum / valueArray.length;
        System.out.format("Average is: %.1f" , average);
    }
}
