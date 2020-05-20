package adapter.classadapter;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/19 11:44
 * @description： 手机类
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5){
            System.out.println("电压为：5V，可以充电");
        }else {
            System.out.println("电压不正常，无法充电");
        }
    }
}
