package javaCore.oop_2;

class Truck implements Service {
    private final String modelName;
    private final int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.modelName);
        for (int i = 0; i < this.wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
