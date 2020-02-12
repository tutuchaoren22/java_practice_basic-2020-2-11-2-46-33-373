package com;

public class South extends Direction {
    public South() {
        super('S');
    }

    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }
}
