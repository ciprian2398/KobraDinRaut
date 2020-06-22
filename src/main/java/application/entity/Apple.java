package application.entity;

import application.Utils;

import java.awt.*;

public class Apple extends Point implements GraphicAdapter {

    private boolean isConsumed;

    public Apple(int x, int y) {
        super(x, y);
    }

    public boolean isConsumed() {
        return isConsumed;
    }

    public void setConsumed(boolean consumed) {
        isConsumed = consumed;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        graphics2D.setColor(Color.red);
        Utils.drawRect(graphics2D, this.x, this.y);
    }
}
