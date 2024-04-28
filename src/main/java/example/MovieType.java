package example;

import java.util.Optional;

interface AdditionalCharge {
    double getAdditionalCharge(double daysRented);
}

public class MovieType {
    private final String name;
    private final Optional<Integer> daysForFrequentRenterPoint;
    private final int daysForAdditionCharge;
    private AdditionalCharge additionalChargeFunc;

    public MovieType(
            String name,
            double price,
            Integer daysForfrequentRenterPoint,
            int daysForAdditionCharge,
            AdditionalCharge additionalChargeFunc) {
        this.name = name;
        this.daysForFrequentRenterPoint = Optional.ofNullable(daysForfrequentRenterPoint);
        this.daysForAdditionCharge = daysForAdditionCharge;
        this.additionalChargeFunc = additionalChargeFunc;
    }

    public String getName() {
        return name;
    }

    public Optional<Integer> getDaysForFrequentRenterPoint() {
        return daysForFrequentRenterPoint;
    }

    public int getDaysForAdditionCharge() {
        return daysForAdditionCharge;
    }

    public AdditionalCharge getAdditionalCharge() {
        return additionalChargeFunc;
    }
}