package Chapter8.Example8_7;

public class Example8_7 {
    public static void main(String args[]) {
        byte d[] = "Java你好".getBytes();
        System.out.println("数组d的长度是：" + d.length);
        String s = new String(d, 6, 2);
        System.out.println(s);
        s = new String(d, 0, 6);
        System.out.println(s);
    }
}
