package com.senlainc.tasks.task4;

import java.util.Scanner;

import com.senlainc.tasks.task4.utils.WordUtils;

public class Task4 {

    public static void main(String[] args) {
    	final Scanner in = new Scanner(System.in);
        final String sentence;
        final String word;
        System.out.println("Введите предложение:");
        try {
            sentence = readStringOrFail(in);
            System.out.println("Какое слово посчитать?");
            word = readStringOrFail(in);
        } catch (final IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }
        in.close();

        System.out.println("Количество таких слов в предложении: " + WordUtils.occurrences(sentence, word));
    }

    private static String readStringOrFail(final Scanner in) {
        final String result = readString(in);
        if (result == null || result.isEmpty()) {
            throw new IllegalArgumentException("Empty input is not allowed");
        }
        return result;
    }

    private static String readString(final Scanner in) {
        final String s =  in.nextLine();
        return s;
    }


}