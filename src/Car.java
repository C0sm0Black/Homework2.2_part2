public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {

        super.service();
        this.checkEngine();

    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
