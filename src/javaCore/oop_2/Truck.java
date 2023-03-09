package javaCore.oop_2;

public class Truck extends ServiceStation {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        super.check();
        checkEngine();
        checkTrailer();
    }
}
