package visitor;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:44
 * @description：
 */
public class ConcreteElement extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operation(){
        System.out.println("访问元素");
    }
}
