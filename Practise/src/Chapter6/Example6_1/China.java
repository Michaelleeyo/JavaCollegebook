package Chapter6.Example6_1;

public class China implements Computable {
    int number;

    public int f(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
