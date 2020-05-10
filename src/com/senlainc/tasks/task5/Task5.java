package com.senlainc.tasks.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.senlainc.tasks.task5.utils.NumberUtils;

public class Task5 {

    public static void main(String[] args) {
        final int limit;
        System.out.println("¬ведите число N в последовательности от 0 до N: ");
        try {
            limit = readPositiveIntOrFail();
        } catch (final IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }

        for (int i = 0; i <= limit; ++i) {
            if (NumberUtils.isPolindrom(i)) {
                System.out.println(i);
            }
        }
    }

    private static int readPositiveIntOrFail() {
        try {
            final Scanner in = new Scanner(System.in);
            final int input = in.nextInt();
            in.close(); 	
            if (input > 0) {
                return input;
            }
        } catch (final InputMismatchException ex) {
            
        }
        throw new IllegalArgumentException("¬ведено неверное значение");
    }

}