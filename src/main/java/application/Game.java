package application;

import application.entity.AppleSupplier;
import application.entity.GraphicAdapter;
import application.entity.Snake;
import application.entity.SnakeDirectionSupplier;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Game implements Runnable, GraphicAdapter {

    AppleSupplier appleSupplier = new AppleSupplier();
    SnakeDirectionSupplier directionSupplier = new SnakeDirectionSupplier();
    Snake snake = new Snake(appleSupplier);

    public Game() {
        new Thread(this).start();
    }

    private void sleep200() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void processEvent(KeyEvent e) {
        directionSupplier.changeDirection(Utils.mapToDirection(e));
    }

    @Override
    public void run() {
        while (true) {
            snake.step(directionSupplier.get());
            sleep200();
        }
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        snake.draw(graphics2D);
        appleSupplier.get().draw(graphics2D);
    }


}
