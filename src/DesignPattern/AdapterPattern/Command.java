package DesignPattern.AdapterPattern;

abstract class Command {
    protected Robot robot;

    public void setRobot(Robot robot){
        this.robot = robot;
    }
    public abstract  void excute();
}

class MoveForwardCommand extends  Command{
    int space;
    public MoveForwardCommand(int space){
        this.space = space;
    }

    @Override
    public void excute() {
        robot.moveForward(space);
    }
}

class TurnCommand extends  Command{
    Robot.Direction direction;
    public TurnCommand(Robot.Direction direction){
        this.direction = direction;
    }

    @Override
    public void excute() {
        robot.turn(direction);
    }
}

class PickUpCommand extends  Command{
    @Override
    public void excute() {
        robot.pickup();
    }
}