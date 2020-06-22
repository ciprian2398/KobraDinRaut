package application.entity;

import java.util.function.Supplier;

public class SnakeDirectionSupplier implements Supplier<Direction> {

    private boolean isStepExecuted = false;
    private Direction snakeDirection = Direction.RIGHT;

    public void changeDirection(Direction newDirection) {
        if (newDirection != null && newDirection != snakeDirection.getOpposite()) {
            snakeDirection = newDirection;
            isStepExecuted = false;
        }
    }

    @Override
    public Direction get() {
        isStepExecuted = true;
        return snakeDirection;
    }
}
