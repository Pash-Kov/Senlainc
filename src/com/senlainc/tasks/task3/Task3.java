package com.senlainc.tasks.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.senlainc.tasks.task3.utils.WordUtils;

public class Task3 {

    public static void main(String[] args) {
    	System.out.println("������� �����������:");
        final String originalInput = readString();

       
        final List<String> words = WordUtils.splitToWords(originalInput);
        System.out.println("� ����������� ����: " + words.size());
        
        final List<String> sortedList = new ArrayList<>(words);
        Collections.sort(sortedList); 
        System.out.println("���������� �� ��������: " + String.join(", ", sortedList));


        System.out.println("������ ����� ���������: " + String.join(" ", WordUtils.capitalise(words)));
    }

    private static String readString() {
        final Scanner in = new Scanner(System.in);
        final String s =  in.nextLine();
        in.close();
        return s;
    }

}
