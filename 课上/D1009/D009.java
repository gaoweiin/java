package D1009;

class Stu {
    int no;
    String name;
    String school;

    void printInfo() {
        System.out.println("no:" + no + "\nshcool: " + school);

    }
}
public class D009 {
    public static void main(String[] args) {
        Stu stu = new Stu();
        stu.printInfo();
    }
}
