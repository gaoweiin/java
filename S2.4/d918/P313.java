package d918;

public class P313 {
    public static void main(String[] args) {
        /*
        byte:-128 to 127
        short:-32768 to 32767
        int:-2147483648 to 2147483647
        Long:-9223372036854775808 to 9223372036854775807
        folat:1.4E-45 to 3.4028235E38
        double:4.9E-324 to 1.7976931348623157E308
        */
        System.out.println("byte:"+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("short:"+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("int:"+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("Long:"+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("folat:"+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("double:"+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
    }
}