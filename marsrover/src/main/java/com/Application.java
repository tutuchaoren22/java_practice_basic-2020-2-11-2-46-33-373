package com;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(new North());
        System.out.println("车子目前的方向是：" + car.getDirection());
        System.out.println("车子左转后的方向是：" + car.turnLeft().getDirection());
        System.out.println("车子右转的方向是：" + car.turnRight().getDirection());
        System.out.println("车子左转后再右转的方向是：" + car.turnLeft().turnRight().getDirection());
    }
}
