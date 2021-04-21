package Example5_3;

public class Example5_3 {
    //Goods类有double型的weight，本来CheapGoods可以继承这个成员变量，但是CheapGoods又重新声明
    //int型的weight，这样就隐藏了继承的double型的weight。但是子类对象可以调用从父类继承的方法操作
    //隐藏的double型成员变量，按double型重量计算价格，子类新定义的方法按Int型重量计算价格。
    public static void main(String args[]) {
        CheapGoods cheapGoods = new CheapGoods();
        cheapGoods.newSetWeight(198);
        System.out.println("对象chaepGoods的weight的值是：" + cheapGoods.weight);
        System.out.println("cheapGoods用子类增加的优惠方法计算价格：" + cheapGoods.newGetPrice());
        cheapGoods.oldSetWeight(198.987);
        System.out.println("cheapGoods使用继承的方法计算价格：" + cheapGoods.oldGetPrice());
    }
}
