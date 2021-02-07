package DesignPattern.SingleTonPattern;

public class StaticSingleton {
    private static StaticSingleton instance;
    static{
        instance = new StaticSingleton();
    }
    private  StaticSingleton(){}

    public static synchronized StaticSingleton getInstance(){
        return instance;
    }
}
