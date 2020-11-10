package D1110;

interface Fly {
    void fly();
}

interface Jump {
    void jump();
}

class Locust implements Fly, Jump {
    public void fly() {
        System.out.println("Locust fly");
    }

    public void jump() {
        System.out.println("Locust jump");
    }
}

class Balloon implements Fly {
    public void fly() {
        System.out.println("Balloon fly");
    }
}


public class FlyJump {
    static void testFly(Fly f) {
        f.fly();
    }
    public static void main(String[] args) {
        Locust l = new Locust();
        testFly(l);
        Balloon b = new Balloon();
        testFly(b);
    }
}
