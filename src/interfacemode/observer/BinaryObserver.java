package interfacemode.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);//我的女神是雅典娜，我是星矢
    }

    @Override
    public void update(){
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
