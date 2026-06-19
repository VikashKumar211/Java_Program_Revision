package ex_18_OOPs_Constructor;

public class car2 {
    String name;
    String varient;
    int year;
    car2(){
        name = "NNN";
        varient = "MMM";
        year = 1990;

    }
    car2( String model_name, int mfg_year){
        this.varient = model_name;
        this.year = mfg_year;

    }

}
