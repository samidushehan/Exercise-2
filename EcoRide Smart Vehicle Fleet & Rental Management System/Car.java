public  class Car extends Vehicle {
    private int numberofDoors;

    public Car(String model , double rate , int numberofDoors){
        super(model , rate);
        setNumberofDoors(numberofDoors);
    }
    public Car(){

        this("Standard Sedan", 60.0, 4);
    }
    public int getNumberofDoors(){
        return numberofDoors;
    }
    public void setNumberofDoors(int numberofDoors){
        if (numberofDoors < 2 || numberofDoors > 6){
            System.out.println("Warning: Invalid door count. Using default value 4.");
            this.numberofDoors = 4;
        }else {
            this.numberofDoors = numberofDoors;
        }
    }
    @Override
    public double calculateRental(int days) {
        return super.calculateRental(days) + (15.0 * days);
    }

    public void openTrunk() {
        System.out.println("Car trunk opened. Ready for luggage.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Doors: " + numberofDoors;
    }
}
