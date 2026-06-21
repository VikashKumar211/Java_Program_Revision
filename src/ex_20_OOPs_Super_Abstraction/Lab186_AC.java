package ex_20_OOPs_Super_Abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
        nexon n1 = new nexon();
        n1.drive();
    }

}

class nexon extends engine1 implements type, gear{

    void drive(){
        startTheEngine();
        changeGear();
        super.stopTheEngine();
        rubbertype();
        blacktye();

    }
    @Override
    public void startTheEngine(){
        System.out.println("Start the engine");
    }

    @Override
    public void changeGear() {
        System.out.println("change the gear");
    }

    public void stopTheEngine(){
        super.stopTheEngine();
        System.out.println("engine stop");
    }

    @Override
    public void blacktye() {

    }

    @Override
    public void rubbertype() {

    }
}







abstract class engine1{
    abstract void startTheEngine();
    void stopTheEngine(){
        System.out.println("stop the engine");
    }

}





interface type{
    void rubbertype();
    void blacktye();

    default void bt1(){

    }
    default void bt2(){

    }
}





interface gear{
    void changeGear();
}