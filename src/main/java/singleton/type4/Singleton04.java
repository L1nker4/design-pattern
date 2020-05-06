package singleton.type4;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/6 21:05
 * @description： 懒汉式
 */
public class Singleton04 {


}

class Singleton{

    /**
     * 构造器私有化，外部不能new
     */
    private Singleton(){
    }

    private static Singleton INSTANCE ;

    public static synchronized Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
