package DesignPattern.AdapterPattern;

interface Order{
    public void run(Robot robot);
}

class MoveBackOrder implements Order{
    private int block;

    public MoveBackOrder(int block){
        this.block = block;
    }

    @Override
    public void run(Robot robot) {
        robot.turn(Robot.Direction.LEFT);
        robot.turn(Robot.Direction.LEFT);
        robot.moveForward(block);
    }
}
