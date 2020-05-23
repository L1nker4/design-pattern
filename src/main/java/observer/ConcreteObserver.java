package observer;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 17:42
 * @description：
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("receive notice");
    }
}
