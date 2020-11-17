package D1117;



public class ReverseStr {

    static boolean isHuiWen(String s) {
        String s2 = new StringBuffer(s).reverse().toString();
        System.out.println(s2);
        if (s2.equals(s)) {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        String s1 = new String("abba");
        if (isHuiWen(s1)) {
            System.out.println("是回文串");
        }
        else {
            System.out.println("不是回文串");
        }
    }
}
