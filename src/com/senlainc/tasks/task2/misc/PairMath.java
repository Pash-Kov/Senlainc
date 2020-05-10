package com.senlainc.tasks.task2.misc;

public class PairMath {

    private static void requirePositive(final int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
    }

    public static int gcd(int a, int b) {
        requirePositive(a);
        requirePositive(b);

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(final int a, final int b) {
        requirePositive(a);
        requirePositive(b);

        return lcm(a, b, gcd(a,b));
    }

    private static int lcm(final int a, final int b, final int gcd) {
        return a * b / gcd;
    }



}
