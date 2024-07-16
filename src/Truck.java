public class Truck extends TransportWithEngine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void repair() {
        super.repair();
        checkTrailer();
    }
}
