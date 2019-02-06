class Car extends Vehicle {

    private boolean airConditioning;

    Car(String name, int fuelCapacity, double fuelConsumption, boolean airConditioning) {
        super(name, fuelCapacity, fuelConsumption);
        this.airConditioning = airConditioning;
    }

    @Override
    double computeReach() {
        if (isAirConditioning())
            return 100 * getFuelCapacity() / (getFuelConsumption() + 0.8);
        else
            return super.computeReach();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Stan klimatyzacji: " + isAirConditioning());
        System.out.printf("Zasięg: %.2f km\n", computeReach());
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

}