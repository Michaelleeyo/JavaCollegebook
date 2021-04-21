package Chapter8.Example8_11;

import java.util.Scanner;

public class Example8_11 {
    public static void main(String args[]) {
        System.out.println("一行文本：");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String regex = "[\\s\\d\\p{Punct}]+";
        //regex是由空格、数字和符号（！"#$%&'()*+,-./:;<=>?@#[\]^_`{|}~)组成的正则表达式
        String words[] = str.split(regex);
        for (int i = 0; i < words.length; i++) {
            int m = i + 1;
            System.out.println("单词" + m + words[i]);
        }
    }
}
