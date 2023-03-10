package javaCore.oop_2;

class ServiceStation {
    void check(Car car) {
        car.check();
    }

    void check(Truck truck) {
        truck.check();
    }

    void check(Bicycle bicycle) {
        bicycle.check();
    }
}
