package ex_17_OOPs_Class_Object;

import java.util.Scanner;

public class Lab_Using_Baby_Class_w_DC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Baby_Class_w_DC baby1 = new Baby_Class_w_DC();
        baby1.name = "cutiee";
        baby1.age = 1;
        baby1.condition();
    }
}
