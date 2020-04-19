package principle.singleresponsibility;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/11 17:22
 * @description：
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("car");
        vehicle2.runAir("plane");

    }
}

/**
 * 这种修改方法没有对原来的类做大的修改，只是增加了方法
 * 这里虽然没有在类这个级别上遵守单一职责原则
 * 但是在方法级别上，仍然是遵守单一职责原则
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " is running in the sky");
    }
}