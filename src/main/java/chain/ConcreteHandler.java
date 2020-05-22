package chain;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/22 15:45
 * @description：
 */
public class ConcreteHandler extends Handler{
    @Override
    public void handleRequest() {
        if (getSuccessor() != null){
            System.out.println("请求传递给："+ getSuccessor());
            getSuccessor().handleRequest();
        }else {
            System.out.println("请求处理");
        }
    }
}
