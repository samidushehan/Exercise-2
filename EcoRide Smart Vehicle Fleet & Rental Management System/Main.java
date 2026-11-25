
public class Main {
    public static void main(String[] args) {
        System.out.println("===== Invalid Car Test =====");
        Car invalidCar = new Car("SportCoupe", -25.0, 10);
        System.out.println(invalidCar);

        System.out.println("\n===== Vehicle Fleet =====");

        Vehicle[] vehicles = {
                new Car("Toyota", 5000.0, 4),
                new Truck("Volvo", 8000.0, 15.0),
                new ElectricCar("Tesla", 10000.0, 4, 90.0)
        };
        for (Vehicle v : vehicles) {

            System.out.println("\n" + v);
            System.out.println("4 Days Rental: $" + v.calculateRental(4));

            if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                ec.chargeBattery();
            }
            else if (v instanceof Truck) {
                Truck t = (Truck) v;
                t.loadCargo();

            }
            else if (v instanceof Car) {
                Car c = (Car) v;
                c.openTrunk();
            }
        }
        System.out.println("===== Total Vehicles =====");
        System.out.println(
                "Total Vehicles Created: " +
                        Vehicle.getTotalVehicle()
        );

    }
}
