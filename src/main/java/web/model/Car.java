package web.model;

public class Car {
    private final String model;
    private final int series;
    private final double mileage;

    public Car(String model, int series, double mileage) {
        this.model = model;
        this.series = series;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public double getMileage() {
        return mileage;
    }
}
