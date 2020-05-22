package iterator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 16:21
 * @description：
 */
public interface Aggregate {

    public void add(Object obj);

    public Iterator createIterator();
}
