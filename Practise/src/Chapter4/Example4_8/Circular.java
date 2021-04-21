package Chapter4.Example4_8;

public class Circular {
    Circle bottom;
    double height;

    Circular(Circle c, double h) {
        bottom = c;
        height = h;
    }

    double getVolem() {
        return bottom.getArea() * height / 3.0;
    }

    double getBottomRadius() {
        return bottom.getRadius();
    }

    public void setBottomRadius(double r) {
        bottom.setRadius(r);
    }
}

