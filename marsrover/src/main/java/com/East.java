package com;

public class East extends Direction {
    public East() {
        super('E');
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }

    @Override
    public Direction turnRight() {
        return new South();
    }
}
