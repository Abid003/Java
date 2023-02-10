package labreport;

public class Problem4 {

    public static class Area {
        double height;
        double width;
        Area(double h, double w) {
            height = h;
            width = w;
        }
        void displyArea() {
            double area = height * width;
            System.out.println("area = " + area);
        }
    }
    public static void main(String[] args) {
        Area rect = new Area(4, 5.3);
        rect.displyArea();
    }
}
