package ex_20_OOPs_Super_Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
        carnew c1= new carnew();
        c1.testEngine();
        c1.startEngine();
        c1.applybreaks();
        c1.stopEngine();
    }

}

class carnew implements breaks, engine{
    void drive(){
        startEngine();
        stopEngine();
        applybreaks();
    }

    @Override
    public void testEngine(){
        System.out.println("Testing the engine");
    }

    @Override
    public void startEngine(){
        System.out.println("Start the engine");
    }

    @Override
    public void applybreaks() {
        System.out.println("apply break");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stop engine!");
    }
}

interface breaks{
    void applybreaks();
}

interface engine{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("Concrete");
    }
}