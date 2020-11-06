package 高巍;

class Vehicle {
    int wheels;
    double weight;

    Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    void printInfo() {
        System.out.println("Wheel:" + this.wheels + "\n weight:" + this.weight);
    }

}

class Car extends Vehicle {

    int loader;
    int defaultLoader = 5;

    Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    void printInfo() {
        System.out.println("Wheel:" + this.wheels + "\n weight:" + this.weight + "\n loader:" + this.loader);
    }

    void overload() {
        if (loader > defaultLoader) {
            System.out.println("超载");
        } else {
            System.out.println("没超载");
        }
    }
}

class Truck extends Car {
    double payload;
    double defaultpayload = 25.5;

    Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    void printInfo() {
        System.out.println("Wheel:" + this.wheels + "\n weight:" + this.weight + "\n loader:" + this.loader
                + "\n payload:" + this.payload);
    }

    void overload() {
        if (payload > defaultpayload) {
            System.out.println("超载");
        } else {
            System.out.println("没超载");
        }
    }
}

public class D1030 {
    public static void main(String[] args) {
        Car c = new Car(4, 1.5, 4);
        Truck t = new Truck(6, 10, 2, 27.6);
        c.printInfo();
        t.printInfo();
        
        c.overload();
        t.overload();
    }
}
