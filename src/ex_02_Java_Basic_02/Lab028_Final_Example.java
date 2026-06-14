package ex_02_Java_Basic_02;

public class Lab028_Final_Example {
    public static void main(String[] args){
        int abc;
        abc = 100;
        final int xyz;
        xyz = 200;
        abc = abc+xyz;
      //  xyz = xyz+abc;//final variable->java: variable xyz might already have been assigned
        System.out.println(abc);
        System.out.println(xyz);

    }
}
