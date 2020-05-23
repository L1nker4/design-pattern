package mediator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 15:21
 * @description：
 */
public class ConcreteColleague extends Colleague {


    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("action");
    }
}
