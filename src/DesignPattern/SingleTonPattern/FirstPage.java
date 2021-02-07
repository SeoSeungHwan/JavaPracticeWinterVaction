package DesignPattern.SingleTonPattern;

public class FirstPage {

    private NormalSingleton singleton = NormalSingleton.getInstance();

    public void setAndPrintSettings() {
        singleton.setDarkMode(true);
        singleton.setFontSize(15);

    }

}
