package DesignPattern.SingleTonPattern;

public class NormalSingleton {

    private NormalSingleton(){};
    private static NormalSingleton instance = null;

    public static NormalSingleton getInstance(){
        if(instance ==null){
            instance = new NormalSingleton();
        }
        return instance;
    }

    private boolean darkMode = false;
    private int fontSize =13;


    public boolean getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

}
