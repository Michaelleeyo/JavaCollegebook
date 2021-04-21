package Chapter4.Example4_5;

public class Example4_5 {

    public static void main(String[] args) {
        Rect ractangle = new Rect();
        ractangle.width = 109.87;
        ractangle.height = 25.18;
        double area = ractangle.getArea();
        System.out.println("���ε������" + area);
        Lader lader = new Lader();
        lader.above = 10.798;
        lader.bottom = 156.65;
        lader.height = 18.12;
        area = lader.getArea();
        System.out.println("���ε������" + area);
    }

}
