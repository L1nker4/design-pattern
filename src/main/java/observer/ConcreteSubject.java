package observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/23 17:35
 * @description：
 */
public class ConcreteSubject implements Subject {

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update();
        }
    }

    public Enumeration<Observer> observers(){
        return observers.elements();
    }

    public void change(){
        this.notifyObserver();
    }

}
