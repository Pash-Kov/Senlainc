package com.senlainc.tasks.task5.utils;

public class NumberUtils {

    public static boolean isPolindrom(final int num) {
        int n = num;
        int reversed = 0;
        while (n > 0)
        {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return reversed == num;
    }

}
