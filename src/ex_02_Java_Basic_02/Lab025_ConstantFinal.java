package ex_02_Java_Basic_02;

public class Lab025_ConstantFinal {
    public static void main(String[] args){
        int a = 10;
        final int b = 20;
         a= a+5;
      //   b = b+56;  //java: cannot assign a value to final variable b

         System.out.println(a);
         System.out.println(b);
    }
}
