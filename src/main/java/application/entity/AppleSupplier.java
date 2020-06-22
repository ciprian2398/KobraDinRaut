package application.entity;

import java.util.Random;
import java.util.function.Supplier;

import static application.Utils.CELL_SIZE;

public class AppleSupplier implements Supplier<Apple> {
    private final Random random;
    private final int min;
    private final int max;
    private Apple apple;

    public AppleSupplier() {
        this.min = 0;
        this.max = CELL_SIZE;
        this.random = new Random();
    }

    @Override
    public Apple get() {
        if (apple == null || apple.isConsumed()) {
            int x = getRandomNumberInRange();
            int y = getRandomNumberInRange();
            return apple = new Apple(x, y);
        } else {
            return apple;
        }
    }

    private int getRandomNumberInRange() {
        return this.random.nextInt((max - min) + 1) + min;
    }
}
