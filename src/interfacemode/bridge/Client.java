package interfacemode.bridge;

import interfacemode.bridge.color.*;
import interfacemode.bridge.shape.*;

public class Client {
    public static void testBridge() {
        Color white = new White();
        Shape square = new Square();
        square.setColor(white);
        square.draw();
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }
}
