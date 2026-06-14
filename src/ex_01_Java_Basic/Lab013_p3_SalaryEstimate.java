package ex_01_Java_Basic;

public class Lab013_p3_SalaryEstimate {
    public static void main(String[] args){
        int rate = 25;
        int hour = 40;
        int weeklypay = hour*rate;
        int yearlypay = 52*weeklypay;
        double tax_ded = yearlypay*0.15;
        System.out.println("Weekly pay is " + weeklypay);
        System.out.println("yearly pay is " + yearlypay);
        System.out.println("tax_ded is " + tax_ded);


    }
}
