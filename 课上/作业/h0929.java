package 作业;

import java.util.*;

public class h0929 {
    static long factorial(long n){
        if (n < 2) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {

        int profit = new Scanner(System.in).nextInt();
        double salary = 3000;
        if (profit < 1001) {
            salary = profit;
        } else if (profit < 2001) {
            salary += 0.1 * profit;
        } else if (profit < 5001) {
            salary += 0.15 * profit;
        } else if (profit < 10001) {
            salary += 0.2 * profit;
        } else {
            salary += 0.25 * profit;
        }
        System.out.println(salary);

        double sum = 0;
        for (int i = 1; i < 21; i++) {
            sum+=1.0/factorial(i);
        }
        System.out.println(sum);
    }
}    
