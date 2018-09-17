package interfacemode.observer;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);//我的女神是雅典娜，我是亚索
    }

    @Override
    public void update(){
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
