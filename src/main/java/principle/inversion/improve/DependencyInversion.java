package principle.inversion.improve;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/19 22:17
 * @description： 依赖倒置原则的案例
 */
public class DependencyInversion {


    public static void main(String[] args) {
        //client无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "email info：Hello world";
    }
}

class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "weixin info : hello";
    }
}


class Person{

    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
