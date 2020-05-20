package adapter.objectadapter;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/19 11:40
 * @description： 被适配的类
 */
public class Voltage220V {

    public int output220V(){
        int src = 220;
        System.out.println("电压："+ src + "伏");
        return src;
    }
}
