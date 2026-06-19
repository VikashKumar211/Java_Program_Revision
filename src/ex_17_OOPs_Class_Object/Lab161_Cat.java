package ex_17_OOPs_Class_Object;

public class Lab161_Cat {
    public static void main(String[] args) {
        cat c1= new cat();
        c1.name = "galaxy";
        c1.age = 3;
        c1.running();
        System.out.println(c1.name);
    }
}

class cat{
    String name;
    int age;

    void running(){
        System.out.println("Fast runner");
    }
}
