package Chapter5.Example5_2;

public class Example5_2 {  //子类ChinaPeople的对象调用继承的方法操作
    // 未被子类继承去分配了内存空间变量
    public static void main(String args[]) {
        ChinaPeople zhangsan = new ChinaPeople();
        System.out.println("子类对象为继承的averageHeight的值是：" + zhangsan.getAverHeight());
        zhangsan.setHeight(178);
        System.out.println("对象的实例变量height的值是：" + zhangsan.getHeight());
    }
}
