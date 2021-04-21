package Chapter8.Example8_9;

import java.util.Scanner;

public class Example8_9 {
    public static void main(String args[]) {
        String regex = "[a-zA-Z ]+";
        System.out.println("请输入任意字符");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.matches(regex)) {
            System.out.println(str + "中的字符都是英文字母");
        } else {
            System.out.println(str + "中的字符不都是英文字母");
        }
    }
}
