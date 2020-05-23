package state;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 19:00
 * @description：
 */
public class ConcreteState extends State {
    @Override
    public void handle() {
        System.out.println("逻辑处理");
    }
}
