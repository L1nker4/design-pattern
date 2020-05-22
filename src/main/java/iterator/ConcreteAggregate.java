package iterator;

import java.util.Vector;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 16:22
 * @description：
 */
public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();

    @Override
    public void add(Object obj) {
        this.vector.add(obj);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size(){
        return vector.size();
    }

    public Object getElement(int index) {
        if (index < vector.size()){
            return vector.get(index);
        }else {
            return null;
        }
    }
}
