package ex_09_Switch;

import java.util.Scanner;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        System.out.println("enter the item code");
        Scanner scan = new Scanner(System.in);

        int item_code = scan.nextInt();
        switch (item_code){

            case 001,002,003:
                System.out.println("electrical");
                break;
            case 004,005:
                System.out.println("mechanical");
                break;
            case 006,007:
                System.out.println("chemical");
                break;
            default:
                System.out.println("invalid code");


        }
    }
}
