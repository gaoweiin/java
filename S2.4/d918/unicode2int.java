package d918;

public class unicode2int {
    public static void main(String[] args) {
        /*
        你的Unicode为 \u4f60
        我的Unicode为 \u6211
        他的Unicode为 \u4ed6
        */
        char a='你',b='我',c='他';
        System.out.println(a+"的Unicode为 \\u"+Integer.toHexString((int)a));
        System.out.println(b+"的Unicode为 \\u"+Integer.toHexString((int)b));
        System.out.println(c+"的Unicode为 \\u"+Integer.toHexString((int)c));

    }
}