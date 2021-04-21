package Chapter4.Default;

public class xianxi {

    public static void main(String[] args) {
        double sum = 0, a = 1;

        int i = 1;

        while (i <= 2) {

            sum = sum + a;

            i++;

            a = a * i;

        }

        System.out.println("sum=" + sum);

    }

}
