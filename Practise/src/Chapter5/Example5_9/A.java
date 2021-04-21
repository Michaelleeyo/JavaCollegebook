package Chapter5.Example5_9;

public class A {
    final double PI = 3.1415926;

    public double getArea(final double r) {
        //r=r+1; //非法，不允许对final变量进行更新操作。
        return PI * r * r;
    }

    public final void speak() {
        System.out.println("您好，How's everything here");
    }
}
