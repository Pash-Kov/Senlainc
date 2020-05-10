package com.senlainc.tasks.task2;

import java.util.Scanner;

import com.senlainc.tasks.task2.misc.PairMath;

import java.util.InputMismatchException;

public class Task2 {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		System.out.println("Введите первое целое число: ");
        final int originalA;
        final int originalB;
        try {
			originalA = readPositiveIntOrFail(in);
			System.out.println("Введите второе целое число: ");
            originalB = readPositiveIntOrFail(in);
        } catch (final IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }
        in.close();
        
        System.out.println("НОД: " + PairMath.gcd(originalA, originalB));
        System.out.println("НОК: " + PairMath.lcm(originalA, originalB));

    }

    private static Integer readPositiveIntOrFail(final Scanner in) {
        try {
            final int input = in.nextInt();
            if (input > 0) {
                return input;
            }
        } catch (final InputMismatchException ex) {
        }
        throw new IllegalArgumentException("Неверное значение");
    }


}