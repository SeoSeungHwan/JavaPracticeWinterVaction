package DesignPattern.SingleTonPattern;

public class VolatileDCLSingleton {
    private volatile  static VolatileDCLSingleton instance;
    private VolatileDCLSingleton(){

    }
    public static VolatileDCLSingleton getInstance(){
        if(instance ==null){
            synchronized (VolatileDCLSingleton.class){
                if(instance == null){
                    instance = new VolatileDCLSingleton();
                }
            }
        }
        return instance;
    }
}
