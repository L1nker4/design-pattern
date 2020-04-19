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

class Person{

    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
