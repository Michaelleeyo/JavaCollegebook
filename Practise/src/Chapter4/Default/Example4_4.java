package Chapter4.Default;

class Point {
    int x, y;

    void setXY(int m, int n) {
        x = m;
        y = n;
    }
}

public class Example4_4 {

    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1������:" + p1);
        System.out.println("p1������" + p2);
        p1.setXY(1111, 2222);
        p2.setXY(-100, -200);
        System.out.println("p1��x,y���꣺" + p1.x + " , " + p1.y);
        System.out.println("p2��x,y���꣺" + p2.x + ", " + p2.y);
        p1 = p2;
        System.out.println("��p2�����ø�ֵ��p1��");
        System.out.println("p1������" + p1);
        System.out.println("p2������" + p2);
        System.out.println("p1��x,y���꣺" + p1.x + " , " + p1.y);
        System.out.println("p2��x,y���꣺" + p2.x + ", " + p2.y);

    }

}
