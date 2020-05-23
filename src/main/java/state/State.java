package state;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 18:58
 * @description：
 */
public abstract class State {

    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();

}
