package D1002;

public class CircleTest {
    public static void main(String[] args) {
        // Circle cir = new Circle();
        // cir.setRadius(5.0);
        // System.out.println(cir.findArea())
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 2; i >=1; i--) {
            for (int j = 1; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
