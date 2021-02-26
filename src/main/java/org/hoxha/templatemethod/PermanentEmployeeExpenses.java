package org.hoxha.templatemethod;

public class PermanentEmployeeExpenses extends EmployeeExpenses {

    @Override
    protected int getCommuteExpenses() {
        return StandardMonthlyPrices.COMMUTE.getValue();
    }

    @Override
    protected int getFoodExpenses() {
        return StandardMonthlyPrices.FOOD.getValue();
    }

    @Override
    protected int getTrainingExpenses() {
        return StandardMonthlyPrices.TRAINING.getValue();
    }
}
