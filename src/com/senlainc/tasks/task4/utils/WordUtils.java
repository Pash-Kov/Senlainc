package com.senlainc.tasks.task4.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordUtils {

    public static List<String> splitToWords(final String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(str.split(" "));
    }

    public static int occurrences(final String sentence, final String word) {
        if (sentence == null || word == null) {
            return 0;
        }
        final List<String> words = WordUtils.splitToWords(sentence);
        int counter = 0;
        for (final String sWord : words) {
            if (word.equalsIgnoreCase(sWord)) {
                ++counter;
            }
        }
        return counter;
    }



}
