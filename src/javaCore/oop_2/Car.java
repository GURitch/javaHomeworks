package javaCore.oop_2;

 class Car extends Bicycle {

     public Car(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
