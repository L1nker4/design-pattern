package bridge;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/20 12:50
 * @description：
 */
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
