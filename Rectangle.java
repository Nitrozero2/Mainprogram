public class Rectangle extends Shape {
    private double d;
    private double r;

    public Rectangle(Point centerPoint, double d, double r) {
        super(centerPoint);
        this.d = d;
        this.r = r;
    }
    public double getArea() {
        return r * d;
    }
    public double getPerimeter() {
        return 2 * (d+ r);
    }
    public String toString() {
        return String.format(
                "Hình chữ nhật  Tâm: %s, Rộng: %.2f, Cao: %.2f, Diện tích: %.2f, Chu vi: %.2f", centerPoint, r, d, getArea(), getPerimeter()
        );    }
}
