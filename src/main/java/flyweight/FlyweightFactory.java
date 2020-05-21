package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/21 16:49
 * @description：
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> pool = new HashMap<>();

    private FlyweightFactory() {
    }

    public static Flyweight getFlyweight(String intrinsicState){
        Flyweight flyweight = pool.get(intrinsicState);
        if(flyweight == null){
            flyweight = new ConcreteFlyWeight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return flyweight;
    }
}
