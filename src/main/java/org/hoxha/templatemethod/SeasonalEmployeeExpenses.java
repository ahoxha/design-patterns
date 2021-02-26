package org.hoxha.templatemethod;

public class SeasonalEmployeeExpenses extends EmployeeExpenses {

    private final int numberOfTrips;
    private final int pricePerTrip;

    public SeasonalEmployeeExpenses(int numberOfTrips, int pricePerTrip) {
        this.numberOfTrips = numberOfTrips;
        this.pricePerTrip = pricePerTrip;
    }

    @Override
    protected int getCommuteExpenses() {
        return numberOfTrips * pricePerTrip;
    }

    @Override
    protected int getFoodExpenses() {
        return StandardMonthlyPrices.FOOD.getValue();
    }
}
