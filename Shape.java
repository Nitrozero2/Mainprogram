public abstract class Shape {
    protected Point centerPoint;
    private static int count = 0;
    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }
    public Point getCenterPoint() {
        return centerPoint;
    }
    public static int getCount() {
        return count;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        return "Tâm: " + centerPoint.toString();
    }
}
