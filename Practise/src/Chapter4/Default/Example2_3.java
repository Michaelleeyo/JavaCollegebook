package Chapter4.Default;

import java.util.Scanner;

public class Example2_3 {
    private static Scanner reader;

    public static void main(String args[]) {
        System.out.println("���������ɸ�����û����һ�����س�ȷ��");
        System.out.println("�������0��������");
        reader = new Scanner(System.in);
        double sum = 0;
        double x = reader.nextDouble();  //��ȡ�û�������������ĸ��ֻ�����������
        while (x != 0) {
            sum = sum + x;
            x = reader.nextDouble();
        }
        System.out.println("sum=" + sum);
    }
}