package ex_20_OOPs_Super_Abstraction;

public class Lab188_Interface_p2 {
    public static void main(String[] args) {
        testCase t1 = new testCase();
        t1.ic1();
        t1.ic2();
        t1.ic3();
    }
}

class testCase implements T1, T2{
    @Override
    public void ic1() {
        System.out.println("ic1");
    }

    @Override
    public void ic2() {
        System.out.println("ic2");
    }

    @Override
    public void ic3() {
        System.out.println("ic3");
    }
}

interface T1{
    void ic1();
    void ic2();
}
interface T2{
    void ic3();
}