public  class Vehicle {
    private int VEHICLE_ID;
    private String model;
    private double rentalRatePerDay;
    private static int totalVehicle = 0;

    public Vehicle(Vehicle other) {
        this(other.model, other.rentalRatePerDay);
    }
    public Vehicle() {
        this("Generic Model", 50.0);
    }
    public Vehicle(String model, double rentalRatePerDay) {
        totalVehicle++;
        VEHICLE_ID = totalVehicle;
        setModel(model);
        setRentalRatePerDay(rentalRatePerDay);

    }

    public int getVehicle_id() {
        return VEHICLE_ID;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            System.out.println("Warning: Invalid model. Using default 'Unknown Model'.");
            this.model = "unknown Model";
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        if (rentalRatePerDay <= 0) {
            System.out.println("Warning: Invalid rental rate. Using default rate 50.0");
            this.rentalRatePerDay = 50.0;
        } else {
            this.rentalRatePerDay = rentalRatePerDay;
        }
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public static void setTotalVehicle(int totalVehicle) {
        Vehicle.totalVehicle = totalVehicle;
    }
    public static int getTotalVehicle(){
        return totalVehicle;
    }

    public double calculateRental(int days) {
        if (days < 1) {
            throw new IllegalArgumentException("Days must be at least 1");
        }
        return rentalRatePerDay * days;
    }

    public double calculateRental(int days, double discountPercent) {
        double total = calculateRental(days);

        if (discountPercent >= 0 && discountPercent <= 50) {
            total -= total * (discountPercent / 100);
        }

        return total;
    }

    public String toString() {
        return "Vehicle #" + VEHICLE_ID + " [" + model +
                "] Rate: $" + rentalRatePerDay + "/day";

    }

}
