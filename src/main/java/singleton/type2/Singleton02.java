package singleton.type2;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/6 21:05
 * @description： 饿汉式
 */
public class Singleton02 {


}

class Singleton{

    /**
     * 构造器私有化，外部不能new
     */
    private Singleton(){
        INSTANCE = new Singleton();
    }

    private static Singleton INSTANCE ;

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
