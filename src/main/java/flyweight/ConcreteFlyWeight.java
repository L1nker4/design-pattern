package flyweight;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/21 16:36
 * @description：
 */
public class ConcreteFlyWeight implements Flyweight {

    //内部状态
    private String intrinsicState;

    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态：" + intrinsicState);
        System.out.println("外部状态：" + extrinsicState);
    }
}
