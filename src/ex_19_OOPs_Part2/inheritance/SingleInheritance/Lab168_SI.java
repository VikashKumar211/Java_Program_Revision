package ex_19_OOPs_Part2.inheritance.SingleInheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        father f1= new father();
        son s1 = new son();
        cousin c1 = new cousin();

        System.out.println(s1.father_gold);
        s1.father_house();
        s1.son_house();

        c1.cousin_house();//cousin can not acces to father class

    }
}
