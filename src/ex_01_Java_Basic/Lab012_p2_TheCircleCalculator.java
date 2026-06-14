package ex_01_Java_Basic;

public class Lab012_p2_TheCircleCalculator {
    public static void main(String[] args){
        double radius = 7.5;
        double  PI = 3.14159;
        double circumference = 2*radius*PI;
        double area = PI*radius*radius;
        System.out.print("Radius" + radius);
        System.out.print(" PI" + PI);
        System.out.println(" ");

        System.out.println("Circumfernece of circle  " + circumference);
        System.out.println("Area of circle  " + area);


    }
}
