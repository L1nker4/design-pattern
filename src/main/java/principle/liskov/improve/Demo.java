package principle.liskov.improve;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/20 19:10
 * @description：
 */
public class Demo {
}

class Base{

}

class A extends Base{
    public int fun1(int a,int b){
        return a - b;
    }
}


class B extends Base {

    private A a = new A();

    public int fun1(int a, int b){
        return a+ b;
    }

    public int fun2(int a,int b){
        return fun1(a, b) + 9;
    }

    public int fun3(int a, int b){
        return this.a.fun1(a, b);
    }
}
