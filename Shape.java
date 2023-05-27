package project2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
Test your code.
 */
public interface Shape {
   double calculateArea();
    double calculatePerimiter();
}
class Circle implements Shape{
private double radius;
final double Pi=3.14;
public Circle(double radius){
    this.radius=radius;
}
    @Override
    public double calculateArea() {
return Pi*radius*radius;
    }

    @Override
    public double calculatePerimiter() {
return 2*Pi*radius;
    }
}

class Square implements Shape{
    private double a;
    public Square (double a){
        this.a=a;
    }

    @Override
    public double calculateArea() {
return a*a;
    }

    @Override
    public double calculatePerimiter() {
return a*4;
    }
}