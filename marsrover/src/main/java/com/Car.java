package com;

public class Car implements TurnDirection {
    private Direction direction;

    public Car() {
    }

    public Car(Direction direction) {
        this.direction = direction;
    }

    public char getDirection() {
        return direction.getDirection();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public Direction turnLeft() {
        return direction.turnLeft();
    }

    @Override
    public Direction turnRight() {
        return direction.turnRight();
    }
}
