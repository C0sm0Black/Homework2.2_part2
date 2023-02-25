public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {

        super.service();
        this.checkTrailer();

    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}


