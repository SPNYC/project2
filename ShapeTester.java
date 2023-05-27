package project2;

public class ShapeTester {
    public static void main(String[] args) {

        Circle circle=new Circle(4);
        System.out.println("Circle area is "+circle.calculateArea());
        System.out.println("Circle perimeter is "+circle.calculatePerimiter());

        Square square=new Square(4);
        System.out.println("Square area is "+square.calculateArea());
        System.out.println("Square perimeter is "+square.calculatePerimiter());

    }
}
