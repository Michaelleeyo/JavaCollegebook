package Chapter4.SingGames;

import java.util.Scanner;

public class InputScore {
    DelScore del;
    private Scanner read;

    InputScore(DelScore del) {
        this.del = del;
    }

    public void inputScore() {
        System.out.println("��������ί��");
        read = new Scanner(System.in);
        int count = read.nextInt();
        System.out.println("�����������ί������");
        double[] a = new double[count];
        for (int i = 0; i < count; i++) {
            a[i] = read.nextDouble();
        }
        del.doDelete(a);
    }
}
