package d918;
import java.util.Scanner;


public class 成绩判断 {

    public static void main(String[] args) {
	// write your code here
        Scanner reader =new Scanner(System.in);
        System.out.print("输入成绩: ");
        int xx = reader.nextInt();
        reader.close();
        if (xx > 90 && xx <=100) {
            System.out.println("A");
        }
        else if (xx > 80 && xx <=100) {
            System.out.println("B");
        }
        else if (xx > 60 && xx <=100) {
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
        

    }
}
