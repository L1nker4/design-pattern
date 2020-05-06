package singleton.type5;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/6 21:05
 * @description： 静态内部类
 */
public class Singleton05 {


}

class Singleton{

    /**
     * 构造器私有化，外部不能new
     */
    private Singleton(){
    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
