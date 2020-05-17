package prototype;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/17 13:19
 * @description：
 */
public class Client {

    public static void main(String[] args) {

        //传统方式
        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
