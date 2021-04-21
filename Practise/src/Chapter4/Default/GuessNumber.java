package Chapter4.Default;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("给你一个1~100的数字，请猜出数字");
        int realNumber = random.nextInt(100) + 1;   //random.nextInt(100)是[0,100)中的随机数
        System.out.println("请输入您的猜测:");
        int yourGuess = reader.nextInt();
        while (yourGuess != realNumber) {
            if (yourGuess > realNumber) {
                System.out.print("猜大了，再输入你的猜测：");
                yourGuess = reader.nextInt();
            } else if (yourGuess < realNumber) {
                System.out.print("猜小了，请再输入你的猜测：");
                yourGuess = reader.nextInt();
            }
        }
        System.out.println("猜对了!");
    }
}
