package bridge;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/20 12:51
 * @description：
 */
public class Client {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
