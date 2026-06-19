package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        grandfather gf1 = new grandfather();
        father f1 = new father();
        son s1 = new  son();

        s1.gf_home();
        s1.father_home();
        s1.son();
    }
}
