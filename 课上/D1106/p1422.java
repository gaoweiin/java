package D1106;

class A {
    public int getNumber(int a) {
        return a + 1;
    }

    double f(double x, double y) {
        return x + y;
    }

    static int g(int n) {
        return n * n;
    }
    
    int m;

    int getM() {
        return m;
    }

    int seeM() {
        return m;
    }
}

class B extends A {
    public int getNumber(int a) {
        return a + 100;
    }

    double f(double x, double y) {
        double m = super.f(x, y);
        return m + x * y;
    }

    static int g(int n) {
        int m = A.g(n);
        return m + n;
    }
    
    int m;

    int getM() {
        return m + 100;

    }
}

public class p1422 {
    public static void main(String[] args) {
        // A a = new A();
        // System.out.println(a.getNumber(10));
        // B b= new B();
        // System.out.println(b.f(10.0, 8.0));
        // System.out.println(b.g(3));
        // A a = new B();
        // // System.out.println(a.getNumber(10));
        // System.out.println(a.f(10.0, 8.0));
        // System.out.println(a.g(3));

        B b = new B();
        b.m = 20;
        System.out.println(b.getM());
        A a = b;
        a.m = -100;
        System.out.println(a.getM());
        System.out.println(b.seeM());
    }
}
