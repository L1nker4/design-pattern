package principle.segregation;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/11 17:41
 * @description：
 */
public class Segregation1 {

    public static void main(String[] args) {

    }
}

interface Interface1 {
    void op1();
    void op2();
    void op3();
    void op4();

}


class B implements Interface1{

    @Override
    public void op1() {
        System.out.println("B实现了接口1");
    }

    @Override
    public void op2() {
        System.out.println("B实现了接口2");
    }

    @Override
    public void op3() {
        System.out.println("B实现了接口3");
    }

    @Override
    public void op4() {
        System.out.println("B实现了接口4");
    }
}
