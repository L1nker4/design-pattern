package command;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 15:14
 * @description：
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
