package memento;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:18
 * @description：
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
