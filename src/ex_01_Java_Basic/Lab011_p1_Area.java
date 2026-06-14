package ex_01_Java_Basic;

public class Lab011_p1_Area {
    /*
    The Practice Problem
    Write a Java program that calculates and displays the area and perimeter of a rectangle.
    Length: 5.5
    Width: 3.2
    Use mathematical formulas:Area = length × width
    Perimeter = 2 × (length + width)
     */
    public static void main(String[] args){
        double l= 5.5, b= 1.2;
        double area =  l*b;
        double perimeter = 2*(l+b);
        System.out.println("Area of rect " + area);
        System.out.println("Perimeter of rect " + perimeter);
    }
}
