package builder;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/17 16:12
 * @description：
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建房子的过程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
