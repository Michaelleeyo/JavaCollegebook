package Chapter4.Default;

public class Example2_2 {
    public static void main(String args[]) {
        byte b = 22;
        int n = 129;
        float f = 123456.6789f;
        double d = 12345679.12345679;
        System.out.println("byte=" + b);
        System.out.println("int =" + n);
        System.out.println("float =" + f);
        System.out.println("double =" + d);
        b = (byte) n;  //���¾��ȵ���ʧ
        f = (float) d;  //���¾��ȵ���ʧ
        System.out.println("b= " + b);
        System.out.println("f= " + f);
    }
}