package D1106;

abstract class Animal {
    abstract void cry();

    abstract String getAnimalName();

}

class Simulator {
    void playSound(Animal animal) {
        System.out.println(animal.getAnimalName());
        animal.cry();
    }

    
}

class Dog extends Animal {
    void cry() {
        System.out.println("dgcry");
    }

    String getAnimalName() {
        return "Dog";
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("cacry");
    }

    String getAnimalName() {
        return "Cat";
    }
}

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        
        simulator.playSound(new Cat());
    }
}
