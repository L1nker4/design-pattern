package proxy;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/21 17:30
 * @description：
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.beforeRequest();
        subject.request();
        this.afterRequest();
    }

    public void beforeRequest(){

    }

    public void afterRequest(){

    }
}
