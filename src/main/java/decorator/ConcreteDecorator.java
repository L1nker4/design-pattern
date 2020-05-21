package decorator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/21 16:14
 * @description：
 */
public class ConcreteDecorator  extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void method(){
        //自己的方法
    }

    @Override
    public void operation() {
        this.method();
        super.operation();
    }
}
