package ex_23_Wrapper_Class;

public class Lab201_Wrapper {
    public static void main(String[] args) {
        ATB a1= new ATB();
        a1.print();
    }
}
class ATB{
    String name;

    void print(){
        System.out.println("Hi Name");
    }
}
