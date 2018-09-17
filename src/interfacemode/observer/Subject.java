package interfacemode.observer;

import java.util.ArrayList;
import java.util.List;
import interfacemode.observer.Observer;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    private void notifyAllObservers() {// 臭流氓来了，你们谁来救救我
        for (Observer observer: observers) {
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {// 雅典娜发现前方一只野生臭流氓
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){// 雅典娜的粉丝又增加了
        observers.add(observer);
    }

}
