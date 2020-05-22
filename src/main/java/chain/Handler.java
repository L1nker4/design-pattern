package chain;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 15:39
 * @description：
 */
public abstract class Handler {

    private Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
