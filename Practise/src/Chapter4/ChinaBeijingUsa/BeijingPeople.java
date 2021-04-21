package Chapter4.ChinaBeijingUsa;

public class BeijingPeople extends ChinaPeople {
    public void averageHeight() {
        height = 172;
        System.out.println("北京人的平均身高：" + height + "cm");
    }

    public void averageWeight() {
        weight = 70;
        System.out.println("北京人的平均体重：" + height + "kg");
    }

    public void beijingopera() {
        System.out.println("花脸，青衣，花旦和老生");
    }
}
