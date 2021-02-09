package DesignPattern.DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        //new XWingFighter().attack();

        //new LaserDecorator(new XWingFighter()).attack();

        new PlasmaDecorator(
                new LaserDecorator(
                        new XWingFighter()
                )
        ).attack();
    }
}
