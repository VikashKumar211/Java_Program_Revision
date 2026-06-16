package ex_09_Switch;

import java.util.Scanner;
public class Lab085_Switch_Without_Break {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day");

        int day = scan.nextInt();

        switch(day){
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("tues");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thru");
            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default:
                System.out.println("Enter valid input between 1 tp 7");
        }

    }

}
