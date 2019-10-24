package circle;

/**
 *
 * @author nick.sabanis
 */
public class Circle {

    private static double radius = 1.0;
    private static String colour = "red";

    public static double getRadius() {
        return radius;
    }

    public static double getArea() {
        return Math.PI * radius * radius;
    }

    public static void printCircle() {
        System.out.println("Circle has radius: " + radius);
        System.out.println("Circle has coliur: " + colour);
        System.out.println("Circle has area: " + getArea());
    }

    public static void main(String[] args) {        
        Circle c1 = new Circle();        
        c1.printCircle();
    }
}
