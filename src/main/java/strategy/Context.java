package strategy;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 16:12
 * @description：
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        this.strategy.strategyInterface();
    }
}
