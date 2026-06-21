package ex_22_ENUM;

public class Lab200_ENUM {
    public static void main(String[] args) {
        System.out.println(locator.page_button.getLocator());
        System.out.println(APIURLS.katalon.getUrl());

    }
}
enum locator{
    page_button("#btn"),
    page_input("#input1");

    private String locator;

    locator(String locator){
        this.locator = locator;
    }
    String getLocator(){
        return this.locator;
    }
}

