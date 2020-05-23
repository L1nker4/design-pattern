package visitor;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:45
 * @description：
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElement concreteElement) {
        concreteElement.operation();
    }
}
