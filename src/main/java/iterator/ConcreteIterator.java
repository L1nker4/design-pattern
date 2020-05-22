package iterator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 16:21
 * @description：
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;

    private int index = 0;

    private int size = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
        this.size = aggregate.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return aggregate.getElement(index++);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }
}
