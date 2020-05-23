package mediator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 15:19
 * @description：
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();

    public void change(){
        mediator.colleagueChanged();
    }
}
