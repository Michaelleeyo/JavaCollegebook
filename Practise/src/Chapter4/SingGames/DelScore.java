package Chapter4.SingGames;

public class DelScore {
    ComputerAver computer;

    DelScore(ComputerAver computer) {
        this.computer = computer;
    }

    public void doDelete(double[] a) {
        java.util.Arrays.sort(a);
        System.out.print("ȥ��һ����߷�:" + a[a.length - 1] + ",");
        System.out.print("ȥ��һ����ͷ֣�" + a[0] + "��");
        double b[] = new double[a.length - 2];
        for (int i = 1; i < a.length - 1; i++) {      //ȥ�����ͷ�
            b[i - 1] = a[i];
        }
        computer.giveAver(b);
    }
}
