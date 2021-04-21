package Chapter5.Example5_7;

public class Sum {
    int n;

    float f() {
        float sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        return sum;
    }
}
