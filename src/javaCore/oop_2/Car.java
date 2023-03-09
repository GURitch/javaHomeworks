package javaCore.oop_2;

 class Car extends ServiceStation {

     public Car(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }
     @Override
     public void check() {
         System.out.println("Обслуживаем " + getModelName());
         for (int i = 0; i < getWheelsCount(); i++) {
             updateTyre();
         }
         checkEngine();
     }
}
