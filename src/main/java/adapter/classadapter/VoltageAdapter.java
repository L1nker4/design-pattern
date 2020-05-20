package adapter.classadapter;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/19 11:42
 * @description： 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        return src / 44;
    }
}
