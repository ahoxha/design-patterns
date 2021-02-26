package org.hoxha.templatemethod;

public enum StandardMonthlyPrices {
    FOOD(175), COMMUTE(320), TRAINING(540);

    int value;

    StandardMonthlyPrices(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
