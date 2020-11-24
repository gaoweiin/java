package D1016;
class AAA {
    static {
        System.out.println("AAA");
    }
    {
        System.out.println("AAAA");
    }
}

public class E {
    static {
        System.out.println("EEEE");
    }
    
    {
        System.out.println("jh");
    }
    public static void main(String[] args) {
        AAA a = new AAA();
        System.out.println("eee");
        a = new AAA();
    }
}
