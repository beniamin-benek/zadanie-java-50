class Vehicle {

    private String name;
    private int fuelCapacity;
    private double fuelConsumption;

    Vehicle(String name, int fuelCapacity, double fuelConsumption) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    double computeReach() {
        return 100 * getFuelCapacity() / getFuelConsumption();
    }

    public void printInfo() {
        System.out.printf("\nNazwa: %s\nPojemność zbiornika paliwa: %d l\nŚrednie zużycie paliwa: %.2f l / 100 km\n", getName(), getFuelCapacity(), getFuelConsumption());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

}