import java.util.ArrayList;
public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        System.out.println("Số lượng hình đã khởi tạo " + Shape.getCount());
        System.out.println("Danh sách các hình");
        for (Shape s : shapes) {
            System.out.println(s);
        }
        System.out.println("Danh sách tâm điểm");
        for (Shape s : shapes) {
            System.out.println("  " + s.getCenterPoint());
        }
    }
}
