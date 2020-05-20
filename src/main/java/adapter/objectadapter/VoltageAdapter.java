package adapter.objectadapter;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/19 11:42
 * @description： 适配器类
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        if(null != voltage220V){
            int src = voltage220V.output220V();
            System.out.println("适配完成");
            return src / 44;
        }
        System.out.println("适配失败");
        return 0;
    }
}
