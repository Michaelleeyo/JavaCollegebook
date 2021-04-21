package Chapter5.Example5_5;

public class Example5_5 {
    // b重写调用父类的computer()方法
    public static void main(String args[]) {
        B b = new B();
        double result = b.computer(8, 9); //b调用重写的方法
        System.out.println(result);
        int m = b.g(12, 8);  //b调用继承的方法
        System.out.println(m);
    }
}
