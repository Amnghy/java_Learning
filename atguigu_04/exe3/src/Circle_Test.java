public class Circle_Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 5;
        c1.find_area();

        double n1 = c1.find_area1();
        System.out.println("面积为："+n1);
    }
}
