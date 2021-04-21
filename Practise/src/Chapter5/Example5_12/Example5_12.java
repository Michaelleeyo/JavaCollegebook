package Chapter5.Example5_12;

public class Example5_12 {
    public static void main(String args[]) {
        B b = new B();
        int sum = b.add(30, 20);  //调用子类重写的add方法
        int sub = b.sub(30, 20);  //调用子类继承的sub方法
        System.out.println("sum=" + sum);
        System.out.println("sub=" + sub);
        A a;
        a = b;
        sum = a.add(30, 20);   //调用子类重写的方法
        sub = a.sub(30, 20);   //调用子类继承的方法
        System.out.println("sum=" + sum);
        System.out.println("sub=" + sub);
    }
}
