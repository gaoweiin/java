package d918;
import java.util.Scanner;


public class 成绩判断 {

    public static void main(String[] args) {
	// write your code here
        Scanner reader =new Scanner(System.in);
        System.out.print("输入成绩: ");
        int xx = reader.nextInt();
        //if
        if (xx > 90 && xx <=100) {
            System.out.println("A");
        }
        else if (xx > 80) {
            System.out.println("B");
        }
        else if (xx > 60) {
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
        
        //switch
            // switch(xx){
            //     case xx>90:
            //         System.out.println("A");
            //         break;
            // }
    }
}
