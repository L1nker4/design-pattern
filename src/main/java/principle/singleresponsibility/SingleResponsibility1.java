package principle.singleresponsibility;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/11 17:13
 * @description：
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("plane");
        vehicle.run("train");
    }
}


/**
 * 交通工具类
 * run方法违反了单一职责原则
 * 解决方案：根据交通工具运行方式不同，分解成不同的类即可
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road");
    }
}
