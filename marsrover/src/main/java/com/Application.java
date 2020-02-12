package com;

public class Application {
    public static void main(String[] args) {
        Direction car =new North() ;
        System.out.println(car.turnLeft().toString());
    }
}
