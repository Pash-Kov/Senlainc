package com.senlainc.tasks.task6.misc.comparator;

import java.util.Comparator;

import com.senlainc.tasks.task6.misc.Item;

public class WeightAscComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }


}
