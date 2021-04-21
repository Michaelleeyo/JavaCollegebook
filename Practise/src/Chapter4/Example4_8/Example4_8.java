package Chapter4.Example4_8;

public class Example4_8 {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("main�����е�circle���ã�" + circle);
        System.out.println("main������circle�İ뾶" + circle.getRadius());
        Circular circular = new Circular(circle, 20);
        System.out.println("circulairԲ׶��bottom�����ã�" + circular.bottom);
        System.out.println("Բ׶��bottom�İ뾶��" + circular.getBottomRadius());
        System.out.println("Բ׶�����" + circular.getVolem());
        double r = 8888;
        System.out.println("Բ׶���ĵ�԰�İ뾶��" + r);
        circular.setBottomRadius(r);
        System.out.println("Բ׶bottom�İ뾶��" + circular.getBottomRadius());
        System.out.println("Բ׶�������" + circular.getVolem());
        System.out.println("main������circle�İ뾶��" + circle.getRadius());
        System.out.println("main������circle�����ý������仯");
        circle = new Circle(1000);
        System.out.println("����main�����е�circle���ã�" + circle);
        System.out.println("main������circle�İ뾶��" + circle.getRadius());
        System.out.println("����Ӱ��circularԲ׶��bottom������");
        System.out.println("circulairԲ׶��bottom�����ã�" + circular.bottom);

    }

}
