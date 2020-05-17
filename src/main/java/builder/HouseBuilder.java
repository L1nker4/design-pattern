package builder;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/17 16:07
 * @description： 抽象建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
