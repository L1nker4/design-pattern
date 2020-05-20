package bridge;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/20 12:49
 * @description： 实现类
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
