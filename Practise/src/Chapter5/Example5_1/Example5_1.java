package Chapter5.Example5_1;

public class Example5_1 {
    public static void main(String args[]) {
        Student zhang = new Student();
        zhang.age = 17;
        zhang.number = 100101;
        zhang.showPeopleMess();
        zhang.tellNumber();
        int x = 9, y = 29;
        System.out.print("会做加法：");
        int result = zhang.add(x, y);
        System.out.printf("%d+%d=%d\n", x, y, result);
        UniverStudent geng = new UniverStudent();
        geng.age = 21;
        geng.number = 6690;
        geng.showPeopleMess();
        geng.tellNumber();
        System.out.print("会做加法：");
        result = geng.add(x, y);
        System.out.printf("%d+%d=%d\t", x, y, result);
        System.out.print("会做乘法：");
        result = geng.multi(x, y);
        System.out.printf("%d*%d=%d\t", x, y, result);
    }
}
