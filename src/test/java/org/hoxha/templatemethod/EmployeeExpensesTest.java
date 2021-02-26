package org.hoxha.templatemethod;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class EmployeeExpensesTest {

    private EmployeeExpenses expenses;

    @Test
    void testGetTotalExpensesForPermanentEmployee() {
        when(new PermanentEmployeeExpenses());

        thenAllExpensesAreCovered();
    }

    @Test
    void testGetTotalExpensesForSeasonalEmployee() {
        int numberOfTrips = 12;
        int pricePerTrip = 2;

        when(new SeasonalEmployeeExpenses(numberOfTrips, pricePerTrip));

        thenFoodAndPerTripExpensesAreCovered(numberOfTrips, pricePerTrip);
    }

    @Test
    void testGetTotalExpensesForExternalEmployee() {
        when(new ExternalEmployeeExpenses());

        thenOnlyCommuteExpensesAreCovered();
    }

    private void when(EmployeeExpenses expenses) {
        this.expenses = expenses;
    }

    private void thenAllExpensesAreCovered() {
        assertThat(expenses.getTotalExpenses()).isEqualTo(getAllCoveredExpenses());
    }

    private int getAllCoveredExpenses() {
        return StandardMonthlyPrices.TRAINING.getValue() + StandardMonthlyPrices.FOOD.getValue() + StandardMonthlyPrices.COMMUTE.getValue();
    }

    private void thenFoodAndPerTripExpensesAreCovered(int numberOfTrips, int pricePerTrip) {
        assertThat(expenses.getTotalExpenses()).isEqualTo(StandardMonthlyPrices.FOOD.getValue() + numberOfTrips * pricePerTrip);
    }

    private void thenOnlyCommuteExpensesAreCovered() {
        assertThat(expenses.getTotalExpenses()).isEqualTo(StandardMonthlyPrices.COMMUTE.getValue());
    }
}
