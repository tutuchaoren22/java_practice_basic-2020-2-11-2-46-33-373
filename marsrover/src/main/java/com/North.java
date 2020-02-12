package com;

public class North extends Direction {
    public North() {
        super('N');
    }

    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }
}
