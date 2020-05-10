package com.senlainc.tasks.task1.misc;

public class IntMath {
    private final int num;

    public IntMath(final int num) {
        this.num = num;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public boolean canPrimeBeDetermined() {
        return num > 1;
    }

    public boolean isPrime() {
        if (num == 2) {
            return true;
        }
        if (num < 1 || num % 2 == 0) { 
            return false;
        }
        for (int i = 3; i < num / 2; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

