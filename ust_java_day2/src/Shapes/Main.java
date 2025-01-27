package Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius= scanner.nextDouble();
        Circle circle=new Circle(radius);
        System.out.println("The area of circle is : "+circle.calculateArea());
        System.out.println("Enter the length of rectangle");
        double length= scanner.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double breadth= scanner.nextDouble();
        Rectangle rectangle=new Rectangle(length,breadth);
        System.out.println("The area of rectangle is : "+rectangle.calculateArea());
        System.out.println("Enter the base of the triangle");
        double base= scanner.nextDouble();
        System.out.println("Enter the height of triangle");
        double height= scanner.nextDouble();
        Triangle triangle=new Triangle(base,height);
        System.out.println("The area of triangle is : "+triangle.calculateArea());




    }
}
