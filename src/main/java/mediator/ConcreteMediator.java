package mediator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 15:19
 * @description：
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague concreteColleague;


    public void createConcreteMediator(){
        concreteColleague = new ConcreteColleague(this);
    }

    @Override
    public void colleagueChanged() {
        concreteColleague.action();
    }

}
