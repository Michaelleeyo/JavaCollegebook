package Chapter4.ChinaBeijingUsa;

public class ChinaPeople extends People {
    public void speakHello() {
        System.out.println("你好！");
    }

    public void averageHeight() {
        height = 168;
        System.out.println("中国人的平均身高：" + height + "cm");
    }

    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均体重：" + weight + "kg");
    }

    public void ChinaGongfu() {
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
