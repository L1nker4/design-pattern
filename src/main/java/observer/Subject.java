package observer;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 15:58
 * @description：
 */
public interface Subject {

    /**
     * 添加观察者
     */
    public void attach(Observer observer);

    /**
     * 删除观察者
     */
    public void detach(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObserver();
}
