package Chapter4.Default;

import java.util.*;

public class Example4_11 {  //���Ƚ���������Ȼ��ʹ�ö��ַ��ж��û��Ӽ��������
    //�����Ƿ��������ĳ��Ԫ�ص�ֵ��ͬ
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int[] a = {12, 34, 9, 45, 6, 90, 123, 19, 34};
        Arrays.sort(a);  //��������
        System.out.println("Arrays.toString(a)");
        System.out.println("���������������жϸ������Ƿ��������У�");
        int number = scanner.nextInt();
        int index = Arrays.binarySearch(a, number);
        if (index >= 0)
            System.out.println(number + "�������е�����Ϊ" + index + "��Ԫ����ͬ");
        else
            System.out.println(number + "�����������κ�Ԫ��ֵ��ͬ");
    }
}
