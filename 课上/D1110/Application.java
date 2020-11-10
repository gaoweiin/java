package D1110;

interface  Animal {
    void cry();

    String getAnimalName();

}

class Simulator {
    void playSound(Animal animal) {
        System.out.println(animal.getAnimalName());
        animal.cry();
    }
}

class Dog implements Animal {
    public void cry() {
        System.out.println("Dog cry");
    }

    public String getAnimalName() {
        return "Dog";
    }
}

class Cat implements Animal {
    public void cry() {
        System.out.println("Cat cry");
    }

    public String getAnimalName() {
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

