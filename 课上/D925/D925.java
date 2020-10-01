
package D925;


public class D925 {
    public static void while12000() {
        //110
        int n = 0;
        while(true){
            n++;
            if(n*n>12000){
                break;}
        }
        System.out.println(n);
    }
    public static void y2ujc(){
        /*
        1
        4
        9
        16
        25
        36
        49
        64
        81
        100
        */
        for(int i =1;i<11;i++){
            System.out.println(i*i);
        }
    }
    public static void ta(){
        /*
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5
        */
        int a[]= new int[6];
        for(int i =1;i<6;i++){
            a[i]=i;
            for(int j=1;j<=i;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }

    public static void lx(){
        /*
          *
         ***
        *****
         ***
          *
        */
        System.out.println("  *\n ***\n*****\n ***\n  *");
    }
    public static void main(String[] args) {
        while12000();
        y2ujc();
        ta();
         lx();
    }
}
