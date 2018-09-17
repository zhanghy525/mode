package interfacemode.observer;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);//我的女神是雅典娜，我是雅典娜，好自恋阿
    }

    @Override
    public void update(){
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
