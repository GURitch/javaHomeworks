package javaCore.oop_2;

 class Car extends Bicycle implements Service {

     public Car(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

     @Override
     public void check() {
         super.check();
         checkEngine();
     }
}
