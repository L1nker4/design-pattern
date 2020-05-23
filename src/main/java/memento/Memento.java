package memento;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:16
 * @description：
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
