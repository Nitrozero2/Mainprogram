public class Square extends Rectangle {
    private double c;
    public Square(Point centerPoint, double c) {
        super(centerPoint, c, c);
        this.c = c;
    }
    public String toString() {
        return "Hình vuông  " + "Tâm: " + getCenterPoint() + ",Cạnh: " + c + ",Diện tích: " + getArea() + ",Chu vi: " + getPerimeter();
    }
}
