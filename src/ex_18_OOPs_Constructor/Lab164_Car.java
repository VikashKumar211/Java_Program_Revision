package ex_18_OOPs_Constructor;

public class Lab164_Car {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.year);

        System.out.println("-----");

        car2 c2 = new car2();
        c2.varient = "nano";
        System.out.println(c2.varient);
    }
}
