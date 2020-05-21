package decorator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/21 16:13
 * @description：
 */
public abstract class Decorator {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation(){
        component.operation();
    }
}
