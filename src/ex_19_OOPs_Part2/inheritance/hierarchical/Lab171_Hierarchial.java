package ex_19_OOPs_Part2.inheritance.hierarchical;

public class Lab171_Hierarchial {
    public static void main(String[] args) {
        son s1 = new son();
        daughter d1 = new daughter();
        father f1 = new father();
        s1.father_house();
        s1.son_house();
        d1.daughter_house();
        d1.father_house();
        System.out.println(s1.gold);
        System.out.println(s1.son_gold);
        System.out.println(d1.daughter_gold);
    }

}
