package com.senlainc.tasks.task6.misc;

public class Item {
    private final int weight;
    private final int cost;
    private final int index;

    public Item(int weight, int cost, int index) {
        this.weight = weight;
        this.cost = cost;
        this.index = index;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public int getIndex() {
        return index;
    }


}
