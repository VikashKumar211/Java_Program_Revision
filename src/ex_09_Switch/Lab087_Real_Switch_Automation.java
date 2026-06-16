package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enther the broweser");

        String browser = scan.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome" :
                System.out.println("Open the browser");
                System.out.println("login to the URL");
                System.out.println("TC1");
                break;
            case "edge" :
                System.out.println("Open the browser");
                System.out.println("login to the URL");
                System.out.println("TC1");
                break;
            default:
                System.out.println("Invalid browser");
        }




    }
}
