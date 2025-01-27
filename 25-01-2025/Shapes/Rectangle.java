package Shapes;

public class Rectangle extends Shape{
    private final double length;
    private final double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
