package D1117;

public class birday {
    // 19550604
    public static void main(String[] args) {
        int temp = 0;
        for (int i = 1950; i < 2020; i++) {
            temp = i * 100 + 6;
            temp *= 100;
            for (int j = 1; j < 32; j++) {
                temp = temp + j;
                if (temp % 2012 == 0 && temp % 3 == 0 && temp % 12 == 0) {
                    System.out.println(temp);
                }
                temp -= j;
            }
            temp = 0;
        }
    }

}
