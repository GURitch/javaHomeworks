package javaCore.oop_2;

 class Car extends ServiceStation {

     public Car(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }
     public void check() {
         super.check();
         checkEngine();
     }
}
