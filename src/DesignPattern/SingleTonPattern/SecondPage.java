package DesignPattern.SingleTonPattern;

public class SecondPage {

    private NormalSingleton singleton = NormalSingleton.getInstance();

    public void printSettings(){
        System.out.println(singleton.getDarkMode() +" , "+singleton.getFontSize());
    }
}
