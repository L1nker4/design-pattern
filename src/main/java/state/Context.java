package state;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:58
 * @description：
 */
public class Context {

    private static State STATE = new ConcreteState();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        currentState.setContext(this);
    }

    public void handle1(){
        this.setCurrentState(STATE);
        this.currentState.handle();
    }
}
