package principle.singleresponsibility;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/11 17:13
 * @description：
 */
public class SingleResponsibility2 {


    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("car");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plane");
    }
}


/**
 * 遵守单一职责原则
 * 改动很大，要将类分解。
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is flying in the sky");
    }
}