public class Truck extends Car {

    private int loadWeight;

    Truck(String name, int fuelCapacity, double fuelConsumption, boolean airConditioning, int loadWeight) {
        super(name, fuelCapacity, fuelConsumption, airConditioning);
        this.loadWeight = loadWeight;
    }

    @Override
    double computeReach() {
        double reach;
        if (getLoadWeight() > 0 && isAirConditioning()) //z załadunkiem i klimatyzacją
            reach = 100 * getFuelCapacity() / (getFuelConsumption() + 0.8 + 0.5 * getLoadWeight() / 100);
        else if (getLoadWeight() > 0 && !isAirConditioning()) //z załadunkiem i bez klimatyzacji
            reach = 100 * getFuelCapacity() / (getFuelConsumption() + 0.5 * getLoadWeight() / 100);
        else
            reach = super.computeReach();

        return reach;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Załadunek: " + getLoadWeight()+ " kg");
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

}