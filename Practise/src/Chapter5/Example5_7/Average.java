package Chapter5.Example5_7;

public class Average extends Sum {
    int n;

    float f() {
        float c;
        super.n = n;
        c = super.f();
        return c / n;
    }

    float g() {
        float c;
        c = super.f();
        return c / 2;
    }
}
