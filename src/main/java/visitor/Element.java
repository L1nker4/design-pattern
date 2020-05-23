package visitor;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:42
 * @description：
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);
}
