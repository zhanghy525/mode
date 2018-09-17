package interfacemode.bridge.shape;

import interfacemode.bridge.color.Color;

public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
