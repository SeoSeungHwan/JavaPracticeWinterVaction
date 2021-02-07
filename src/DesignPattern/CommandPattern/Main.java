package DesignPattern.CommandPattern;

public class Main {
    public static void main(String[] args) {
        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(2));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new MoveForwardCommand(1));
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new PickUpCommand());

        robotKit.start();
    }

}
