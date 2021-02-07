package DesignPattern.SingleTonPattern;

public class DCLSingleton {
    private static  DCLSingleton dclSingleton;
    private DCLSingleton(){}

    public static DCLSingleton getInstance(){
        if(dclSingleton == null){
            synchronized (DCLSingleton.class){
                if(dclSingleton ==null){
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return  dclSingleton;
    }
}
