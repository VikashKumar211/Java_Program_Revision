package ex_22_ENUM;

public class Lab198_ENUM_P2 {
    public static void main(String[] args) {
        System.out.println(urls.edge);

        if(urls.google.equals("google")){
            System.out.println("this will open edge");
        }else {
            System.out.println("nothing");
        }
    }
}

enum urls{
    google, edge, restassured
}