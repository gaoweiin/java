package 作业;

public class D1117 {
    static void printStrPosition() {
        String s=new String("Hello!Java!");
        for (int i = 0; i < s.length(); i++) {
            System.out.printf("第%d个字符: %c\n", i, s.charAt(i));
        }
    }
    static void reverse() {
        StringBuffer s1 = new StringBuffer("我是谁");
        System.out.println(s1.reverse());
    }
    public static void main(String[] args) {
        printStrPosition();
        reverse();
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to JAVA");
        String s3 = new String(" welcome to Java "); 
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3.trim()));
        System.out.println(s3.indexOf('o'));
        System.out.println(s3.lastIndexOf("o"));
        System.out.println(s1.substring(6, 12));

    }
}
