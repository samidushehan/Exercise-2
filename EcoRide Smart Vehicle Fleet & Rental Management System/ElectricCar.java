public  class ElectricCar extends Car{
    private double batteryCapacityKWH;

    public ElectricCar(String model , double rate ,int doors ,double batteryCapacityKWH){
        super(model,rate,doors);
        setBatteryCapacityKWH(batteryCapacityKWH);
    }

    public ElectricCar(){
        this("EV Standard", 80.0, 4, 60.0);
    }
    public void setBatteryCapacityKWH(double batteryCapacityKWH){
        if ( batteryCapacityKWH < 20.0 || batteryCapacityKWH > 200.0){
            System.out.println("Warning! Invalid Battery capacity . ");
            this.batteryCapacityKWH = 50.0;
        }else{
            this.batteryCapacityKWH = batteryCapacityKWH;
        }
    }
    @Override
    public double calculateRental(int days){
        return super.calculateRental(days) * 0.90;
    }
    public void chargeBattery(){
        System.out.println("Charging the "+batteryCapacityKWH+" kWh battery pack via fast charger.");
    }
    @Override
    public String toString(){
        return super.toString()+"| EV battery "+batteryCapacityKWH+" KWh ";
    }
}
