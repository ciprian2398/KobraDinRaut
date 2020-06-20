package application;

import java.awt.*;

public class Game {
    int gridSize = 5;
    int gameMap[][] = new int[gridSize][gridSize];

    void blackMap() {
        for (int i = 0; i < gridSize - 1; i++) {
            for (int j = 0; j < gridSize - 1; j++) {
                gameMap[i][j] = 1;
            }
        }
    }

    void paintMap(Graphics2D graphics2D) {
        for (int i = 0; i < gridSize - 1; i++) {
            for (int j = 0; j < gridSize - 1; j++) {
                int x = i * 400 / gridSize;
                int y = j * 400 / gridSize;
                int w = 400 / gridSize;
                int h = 400 / gridSize;
                graphics2D.fillRect(x, y, w, h);
            }
        }
    }

    public void nextFrame(Graphics2D graphics2D) {

        graphics2D.setColor(Color.BLACK);
        graphics2D.drawLine(0, 0, 400, 400);

        paintMap(graphics2D);

    }
}
