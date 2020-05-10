package com.senlainc.tasks.task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.senlainc.tasks.task6.misc.Item;
import com.senlainc.tasks.task6.misc.comparator.WeightAscComparator;

public class Task6 {

    public static void main(String[] args) {
        System.out.print("Размер сумки: ");
        final Scanner in = new Scanner(System.in);
        final int bag = Objects.requireNonNull(readPositiveOrNull(in));

        final List<Item> items = new ArrayList<>();
        int counter = 0;
        while (true) {
            System.out.print("Введите вес и стоимость вещи №" + ++counter + " (например: '30' (вес) '40' (стоимость) или 'х' для завершения): ");
            final Integer weight = readPositiveOrNull(in);
            final Integer cost = readPositiveOrNull(in);
            if (weight == null || cost == null) {
                break;
            }
            items.add(new Item(weight, cost, counter));
        }

        items.sort(new WeightAscComparator());

        int[][] tmp = new int[items.size() + 1][bag + 1];
        for (int i = 0; i < items.size(); ++i) {
            tmp[i][0] = 0;
        }
        for (int j = 0; j < bag; ++j) {
            tmp[0][j] = 0;
        }
        for (int i = 1; i <= items.size(); ++i) {
            for (int j = 1; j <= bag; ++j) {
                if (j >= items.get(i - 1).getWeight()) {
                    tmp[i][j] = Math.max(tmp[i - 1][j], tmp[i - 1][j - items.get(i - 1).getWeight()] + items.get(i - 1).getCost());
                } else {
                    tmp[i][j] = tmp[i-1][j];
                }
            }
        }
        final List<Integer> take = new ArrayList<>();
        resolveItems(take, items, tmp, items.size(), bag);

        if (take.size() > 0) {
            System.out.print("Можем взять следующие вещи: ");
            for (final Integer index : take) {
                System.out.print(items.get(index - 1).getIndex() + " ");
            }
        }
        else {
            System.out.println("Нечего взять(");
        }

    }

    private static void resolveItems(final List<Integer> result, List<Item> items, int[][] tmp, int i, int j) {
        if (tmp[i][j] == 0) {
            return;
        }
        if (tmp[i - 1][j] == tmp[i][j]) {
            resolveItems(result, items, tmp, i - 1, j);
        }
        else {
            resolveItems(result, items, tmp, i - 1, j - items.get(i -1).getWeight());
            result.add(i);
        }
    }

    private static Integer readPositiveOrNull(final Scanner in) {
        final int input;
        try {
            input = in.nextInt();
            if (input > 0) {
                return input;
            }
        } catch (final InputMismatchException ex) {
        }
        return null;
    }

}