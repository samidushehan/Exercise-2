public class Truck extends Vehicle{
    private double cargoCapacityTons;

    public Truck(String model , double rate , double cargoCapacityTons) {
        super(model, rate);
        setCargoCapacityTons(cargoCapacityTons);
    }
    public Truck(){
        this("Commercial Hauler ",100.0,5.0);
    }

    public void setCargoCapacityTons(double cargoCapacityTons){
        if ( cargoCapacityTons >= 0.5 && cargoCapacityTons <= 40.0){
            this.cargoCapacityTons = cargoCapacityTons;
        }else {
            System.out.println("Warning: Invalid cargo capacity. Using default 2.0 tons.");
            this.cargoCapacityTons = 2.0;
        }
    }
    public double getCargoCapacityTons(){
        return cargoCapacityTons;
    }
    @Override
    public double calculateRental(int days){
        return super.calculateRental(days)+(50.0*days);
    }
    public void loadCargo(){
        System.out.println("Loading cargo up to "+cargoCapacityTons+" tons capacity.");
    }
    @Override
    public String toString(){
        return super.toString()+"| Cargo "+cargoCapacityTons+" Tons ";
    }
}
