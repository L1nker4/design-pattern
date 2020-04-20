package principle.liskov;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/20 19:10
 * @description：
 */
public class Demo {
}


class A {
    public int fun1(int a,int b){
        return a - b;
    }
}


class B extends A {

    @Override
    public int fun1(int a, int b){
        return a+ b;
    }

    public int fun2(int a,int b){
        return fun1(a, b) + 9;
    }
}
