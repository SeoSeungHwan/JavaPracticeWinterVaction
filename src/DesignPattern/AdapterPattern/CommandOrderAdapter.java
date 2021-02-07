package DesignPattern.AdapterPattern;

public class CommandOrderAdapter  extends Command{

    private Order order;
    public CommandOrderAdapter (Order order){
        this.order = order;
    }

    @Override
    public void excute() {
        order.run(robot);
    }
}
