public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Fiat 126p", 21, 6, false); // 21, 6
        vehicles[1] = new Truck("Mercedes-Benz Actros", 600, 21, false, 0);
        vehicles[2] = new Car("Volkswagen Garbus", 41, 10, false); // 41, 10

        for (int i = 0; i < vehicles.length; i++)
            vehicles[i].printInfo();

        System.out.print("--------------------------------------");

        //włączenie klimatyzacji
        ((Car) vehicles[0]).setAirConditioning(true);
        ((Truck) vehicles[1]).setAirConditioning(true);
        ((Car) vehicles[2]).setAirConditioning(true);

        //dodanie załadunku
        ((Truck) vehicles[1]).setLoadWeight(1200);

        for (int i = 0; i < vehicles.length; i++)
            vehicles[i].printInfo();

    }

}