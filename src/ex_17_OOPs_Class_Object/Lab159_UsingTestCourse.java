package ex_17_OOPs_Class_Object;

import java.util.Scanner;
public class Lab159_UsingTestCourse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TestCourse vikash = new TestCourse();
        System.out.println("enter the name");
        vikash.name = scanner.next();
        System.out.println("enter the age");
        vikash.age = scanner.nextInt();
        vikash.speak();

        System.out.println("--------");
        System.out.printf("Name of student is %s and age of student is %d ", vikash.name, vikash.age);
    }
}
