package org.hoxha.templatemethod;

public class ExternalEmployeeExpenses extends EmployeeExpenses {
    @Override
    protected int getCommuteExpenses() {
        return StandardMonthlyPrices.COMMUTE.getValue();
    }
}
