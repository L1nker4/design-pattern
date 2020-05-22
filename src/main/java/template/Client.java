package template;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 14:33
 * @description：
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass ac = new ConcreteClass();
        ac.templateMethod();
    }
}
