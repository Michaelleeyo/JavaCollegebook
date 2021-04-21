package Chapter4.Piilar;

public class Application {
    public static void main(String args[]) {
        Pillar pillar;
        Geometry bottom;
        bottom = new Rectangle(12, 22);
        pillar = new Pillar(bottom, 58);
        System.out.println("矩形底的柱体体积：" + pillar.getVolume());
        bottom = new Circle(10);
        pillar = new Pillar(bottom, 58);
        System.out.println("圆形底的柱体体积：" + pillar.getVolume());
    }
}
