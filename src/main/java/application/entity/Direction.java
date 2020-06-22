package application.entity;

public enum Direction {
    UP {
        @Override
        public Direction getOpposite() {
            return Direction.DOWN;
        }
    },
    DOWN {
        @Override
        public Direction getOpposite() {
            return Direction.UP;
        }
    },
    RIGHT {
        @Override
        public Direction getOpposite() {
            return Direction.LEFT;
        }
    },
    LEFT {
        @Override
        public Direction getOpposite() {
            return Direction.RIGHT;
        }
    };

    private Direction opposite;

    public abstract Direction getOpposite();
}
