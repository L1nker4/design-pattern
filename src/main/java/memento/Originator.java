package memento;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:15
 * @description：
 */
public class Originator {

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
