package labreport;

public class Problem7 {
    public static class Area {
        int height;
        int width;
        public void calculate_area(int height, int width) {
            this.height = height;
            this.width = width;

            int area = height * width;

            System.out.println("Area of rectengle = " + area);
        }
        public void calculate_area(int height) {
            this.height = height;

            int area = height * height;

            System.out.println("Area of Squire = " + area);
        }
    }
    public static void main(String[] args) {
        Area rect, square;

        rect = new Area();
        rect.calculate_area(13, 4);

        square = new Area();
        square.calculate_area(5);
    }

}
