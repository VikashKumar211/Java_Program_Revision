package ex_09_Switch;

import java.util.Scanner;
public class Lab086_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the day");

        if(scan.hasNextInt()){
            int day = scan.nextInt();

            switch (day){
                case 1:
                    System.out.println("mon");
                default:
                    System.out.println("enter valid input");
            }
        }else {
            System.out.println("invalid");
        }

    }

}