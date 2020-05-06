package singleton.type1;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/6 21:05
 * @description： 饿汉式
 */
public class Singleton01 {


}

class Singleton{

    /**
     * 构造器私有化，外部不能new
     */
    private Singleton(){

    }

    private final static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
