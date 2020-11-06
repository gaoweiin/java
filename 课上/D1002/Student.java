package D1002;

public class Student {
    int no;
    String name;
    int age;


    static int sum;
    {
        sum++;
        System.out.println(sum);
    }


    void study() {
        System.out.println("Study");
    }

    void sport() {
        System.out.println("Sport");
    }

    void sleep() {
        System.out.println("Sleep");
    }
    
}
