package Chapter4.ChinaBeijingUsa;

public class People {
    protected double weight, height;

    public void speakHello() {
        System.out.println("yayaya");
    }

    public void averageHeight() {
        height = 173;
        System.out.println("average height:" + height + "cm");
    }

    public void averageWeight() {
        weight = 70;
        System.out.println("average weight:" + weight + "kg");
    }
}
