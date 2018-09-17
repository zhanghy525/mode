package interfacemode.observer;

public class ObserverPatternDemo {

    public static void test(){
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        System.out.println("----------------------------");
        subject.setState(15);
        System.out.println("----------------------------");
        subject.setState(10);
    }
}
