package prototype.improve;

import prototype.improve.Sheep;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/17 13:46
 * @description：
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep sheep1 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
