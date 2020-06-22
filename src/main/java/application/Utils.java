package application;

import application.entity.Direction;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Utils {
    public static final int CELL_SIZE = 15;

    public static Direction mapToDirection(KeyEvent event) {
        int key = event.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            return Direction.LEFT;
        }
        if (key == KeyEvent.VK_RIGHT) {
            return Direction.RIGHT;
        }
        if (key == KeyEvent.VK_UP) {
            return Direction.UP;
        }
        if (key == KeyEvent.VK_DOWN) {
            return Direction.DOWN;
        }
        return null;
    }

    public static void drawRect(Graphics2D graphics2D, int x, int y) {
        graphics2D.fillRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }
}
