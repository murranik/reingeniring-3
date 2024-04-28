package example;

interface AdditionalCharge {
    double getAdditionalCharge(double daysRented);
}

public class MovieType {
    private final String name;
    private final int daysForfrequentRenterPoint;
    private final int daysForAdditionCharge;
    private AdditionalCharge additionalChargeFunc;

    public MovieType(
            String name,
            double price,
            int daysForfrequentRenterPoint,
            int daysForAdditionCharge,
            AdditionalCharge additionalChargeFunc) {
        this.name = name;
        this.daysForfrequentRenterPoint = daysForfrequentRenterPoint;
        this.daysForAdditionCharge = daysForAdditionCharge;
        this.additionalChargeFunc = additionalChargeFunc;
    }

    public String getName() {
        return name;
    }

    public int getDaysForfrequentRenterPoint() {
        return daysForfrequentRenterPoint;
    }

    public int getDaysForAdditionCharge() {
        return daysForAdditionCharge;
    }

    public AdditionalCharge getAdditionalCharge() {
        return additionalChargeFunc;
    }
}