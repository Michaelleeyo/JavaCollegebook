package Chapter4.ChinaBeijingUsa;

public class AmericanPeople extends People {
    public void speakHello() {
        System.out.println("How are you!");
    }

    public void averageHeight() {
        height = 176;
        System.out.println("American's average height:" + height + "cm");
    }

    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight:" + weight + "kg");
    }

    public static void americanBoxing() {
        System.out.println("直拳，勾拳，组合拳");
    }
}