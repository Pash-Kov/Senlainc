package com.senlainc.tasks.task1;
import java.util.Scanner;

import com.senlainc.tasks.task1.misc.IntMath;

import java.util.InputMismatchException;

public class Task1 {

    public static void main(String[] args) {
    	System.out.print("Введите любое целое число: ");
        final Integer original = readIntOrNull(); 
        if (original == null) { 
            System.err.println("Введено некорректное значение");
            return;
        }

        final IntMath math = new IntMath(original);

        System.out.println(math.isEven() ? "Четное" : "Нечетное");

        if (math.canPrimeBeDetermined()) { 
            System.out.println(math.isPrime() ? "Простое " : "Составное");
        } else {
            System.out.println("Ни простое, ни составное");
        }
    }

    private static Integer readIntOrNull() {
        try {
            final Scanner in = new Scanner(System.in);
            final Integer i = in.nextInt();
            in.close();
            return i;
        } catch (final InputMismatchException ex) {
        	
        }
        return null;
    }



}
