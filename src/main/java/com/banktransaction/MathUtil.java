package com.banktransaction;


import java.util.Random;

public class MathUtil {

    private static Random random = new Random();

    public static double generateRandomAmount() {
        return random.nextDouble() * 1000;
    }

    public static double performHeavyComputation() {
        double result = 0;
        for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
            result += Math.sqrt(random.nextDouble()) * Math.log(random.nextDouble());
        }
        return result;
    }
}
