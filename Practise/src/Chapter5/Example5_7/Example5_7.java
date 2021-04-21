package Chapter5.Example5_7;

public class Example5_7 {
    //子类使用super访问和调用被子类隐藏的成员变量和方法
    public static void main(String args[]) {
        Average aver = new Average();
        aver.n = 100;
        float resultOne = aver.f();
        float resultTwo = aver.g();
        System.out.println("resultOne=" + resultOne);
        System.out.println(("resultTwo=" + resultTwo));
    }
}
