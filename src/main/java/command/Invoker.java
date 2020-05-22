package command;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 15:16
 * @description：
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
