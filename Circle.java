public class Circle extends Shape {
    private double r;
    public Circle(Point centerPoint, double r) {
        super(centerPoint);
        this.r = r;
    }
    public double getArea() {
        return Math.PI * r * r;
    }
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
    public String toString() {
        return String.format(
                "Hình tròn  Tâm: %s,Bán kính: %.2f,Diện tích: %.2f,Chu vi: %.2f", centerPoint, r, getArea(), getPerimeter()
        );    }
}
