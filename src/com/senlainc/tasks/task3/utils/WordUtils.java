package com.senlainc.tasks.task3.utils;

import java.util.ArrayList;
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

    public static List<String> capitalise(final List<String> words) {
        if (words == null || words.isEmpty()) {
            return Collections.emptyList();
        }
        final List<String> capitalized = new ArrayList<>();
        for (final String word : words) {
            String capitalizedWord = "";
            if (word.length() > 0) {
                capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            capitalized.add(capitalizedWord);
        }
        return capitalized;
    }

}
