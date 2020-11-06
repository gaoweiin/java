package D1023;

class A {
    private int n1 = 1;
    int n2 = 2;

    int show() {
        return n1;
    }

    void play() {
        System.out.println("play toy");
    }
}

class B extends A {
    int n2 = 4;
    int n3 = 3;

    int fun() {
        return super.n2;
    }

    void play() {
        super.play();
        System.out.println("play football");
    }

}

public class Test {

    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.n2);
        System.out.println(b1.fun());
        System.out.println(b1.n3);
        System.out.println(b1.show());
        b1.play();

    }
}
