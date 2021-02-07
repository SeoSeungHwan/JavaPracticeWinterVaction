package DesignPattern.SingleTonPattern;

public class SynchronizedSingleton {
    private SynchronizedSingleton(){};
    private static SynchronizedSingleton instance = null;

    public static synchronized SynchronizedSingleton getInstance(){
        if(instance ==null){
            instance = new SynchronizedSingleton();
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
