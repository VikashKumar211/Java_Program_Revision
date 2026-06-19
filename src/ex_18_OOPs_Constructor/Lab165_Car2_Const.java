package ex_18_OOPs_Constructor;

public class Lab165_Car2_Const {
    public static void main(String[] args) {
        car2 c2= new car2("nano", 2014);
        System.out.println(c2.varient);
        System.out.println(c2.year);

        car2 c3 = new car2();
        System.out.println(c3.year);
        System.out.println(c3.name);
    }
}
