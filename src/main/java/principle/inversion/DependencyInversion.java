package principle.inversion;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/19 22:17
 * @description：
 */
public class DependencyInversion {


    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email{
    public String getInfo() {
        return "email info：Hello world";
    }
}

/**
 * 如果获取的对象是短信，则新增类，同时Person需要添加相应的接收方法
 * 解决：添加一个抽象接口IReceiver，表示接收者，这样Person与接口发生依赖
 *
 */
class Person{

    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
