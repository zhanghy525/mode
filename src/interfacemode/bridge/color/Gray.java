package interfacemode.bridge.color;

public class Gray implements Color{
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的"+shape);
    }
}
