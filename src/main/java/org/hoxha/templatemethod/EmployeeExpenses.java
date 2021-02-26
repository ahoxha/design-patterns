package org.hoxha.templatemethod;

public abstract class EmployeeExpenses {
    private static final int NO_EXPENSES = 0;

    public int getTotalExpenses() {
        return getCommuteExpenses() + getFoodExpenses() + getTrainingExpenses();
    }

    protected int getCommuteExpenses() {
        return NO_EXPENSES;
    }

    protected int getFoodExpenses() {
        return NO_EXPENSES;
    }

    protected int getTrainingExpenses() {
        return NO_EXPENSES;
    }
}
