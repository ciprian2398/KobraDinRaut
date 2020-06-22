package application.entity;


import application.Utils;

import java.awt.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Snake implements GraphicAdapter {
    private final ConcurrentLinkedDeque<Point> points;
    private final AppleSupplier appleSupplier;

    public Snake(AppleSupplier appleSupplier) {
        this.appleSupplier = appleSupplier;
        this.points = new ConcurrentLinkedDeque<>();
        this.points.add(new Point(5, 5));
    }

    public ConcurrentLinkedDeque<Point> getPoints() {
        return points;
    }

    public void step(Direction direction) {
        if (direction == Direction.UP) {
            moveHead(0, -1);
        } else if (direction == Direction.DOWN) {
            moveHead(0, 1);
        } else if (direction == Direction.RIGHT) {
            moveHead(1, 0);
        } else if (direction == Direction.LEFT) {
            moveHead(-1, 0);
        }
    }

    private void moveHead(int onX, int onY) {
        final Point p = points.getFirst();
        final Point newPoint = new Point(p.x + onX, p.y + onY);
        points.addFirst(newPoint);

        if (appleSupplier.get().x == newPoint.x && appleSupplier.get().y == newPoint.y) {
            appleSupplier.get().setConsumed(true);
        } else {
            points.pollLast();
        }
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        graphics2D.setColor(Color.blue);
        points.forEach(p -> Utils.drawRect(graphics2D, p.x, p.y));
    }
}
