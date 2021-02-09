package DesignPattern.DecoratorPattern;

public class PlasmaDecorator extends  FighterDecorator{
    public PlasmaDecorator(Fighter decoratedFighter) {
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("플라즈마 발사");
    }
}
