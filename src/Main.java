public class Main {
    public static void main(String[] args) {
        Car car = new Car("porsche", 4);
        Truck truck = new Truck("thor", 6);
        Bicycle bicycle = new Bicycle("pinarello", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle, car, truck);
    }
}
