package DesignPattern.DecoratorPattern;

public class XWingFighter implements Fighter{
    @Override
    public void attack() {
        System.out.println("총알 발사");
    }
}
