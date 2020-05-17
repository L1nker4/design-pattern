package builder;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/17 16:10
 * @description：
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("地基");
    }

    @Override
    public void buildWall() {
        System.out.println("砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("封顶");
    }
}
