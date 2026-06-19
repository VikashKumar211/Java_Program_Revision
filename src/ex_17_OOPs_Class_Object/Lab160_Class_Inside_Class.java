package ex_17_OOPs_Class_Object;

public class Lab160_Class_Inside_Class {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "vikash";
        s1.age = 25;
        s1.course_id = 225;
        s1.course_name = "Testing";
        System.out.println(s1.name);
        s1.behaviour();

    }

}
class student{
    String name;
    int age;
    String course_name;
    int course_id;

    student(){
        System.out.println("default");
    }

    void behaviour(){
        System.out.println("Function/behavioyur");
    }
}
