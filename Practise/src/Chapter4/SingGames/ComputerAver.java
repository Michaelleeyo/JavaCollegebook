package Chapter4.SingGames;

public class ComputerAver {
    public void giveAver(double[] b) {
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        double aver = sum / b.length;
        System.out.println("ѡ�����ĵ÷�" + aver);
    }
}
