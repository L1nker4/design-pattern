package adapter.objectadapter;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/19 11:47
 * @description：
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
