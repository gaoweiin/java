package D1106;

abstract class Vehicle {
    abstract void run();
}

class Car extends Vehicle {
    void run() {
        System.out.println("A car is running");
    }
}

class Bus extends Vehicle {
    void run() {
        System.out.println("A bus is running");
    }
}


public class VehicleTest {
    public static void main(String[] args) {
        new Car().run();
        new Bus().run();       
    }
}
