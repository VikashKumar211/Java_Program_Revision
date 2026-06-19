package ex_18_OOPs_Constructor;

public class Car {
    String name;
    String model;
    int year;

    Car(){
        name = "Unknown";
        model = "XYZ";
        year = 1990;
        System.out.println("Default values");

    }
    void condition(){
        System.out.println("in new condition");
    }
    void mileage(){
        System.out.println("mileage will be apporx 12 KMPL");
    }
}
