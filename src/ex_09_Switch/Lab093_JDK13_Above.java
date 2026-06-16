package ex_09_Switch;

import java.util.Scanner;

public class Lab093_JDK13_Above {
    public static void main(String[] args) {
        System.out.println("Enter the input");

        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt()){
            int item_code = scan.nextInt();
            switch (item_code){
                case 001 -> System.out.println("electroinic");
                case 002 -> System.out.println("mechanical");
                case 003 -> System.out.println("chemical");
                default -> System.out.println("enter valid item");
            }
            }else {
            System.out.println("invalid");
        }
        }


    }

