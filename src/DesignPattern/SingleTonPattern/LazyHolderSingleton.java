package DesignPattern.SingleTonPattern;

public class LazyHolderSingleton {
    private LazyHolderSingleton(){}
    public static LazyHolderSingleton getInstance(){
        return  LazyHolder.instance;
    }
    private  static class LazyHolder{
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }
}
