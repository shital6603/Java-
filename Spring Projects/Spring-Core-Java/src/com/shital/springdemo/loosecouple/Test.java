package com.shital.springdemo.loosecouple;

public class Test {
    public static void main(String[] args) {
        EngineFactory engineFactory=new EngineFactory();
        engineFactory.getInstance("Petrol");
        Car car=new Car(new DieselEngine("Petrol"));
        car.drive();
    }
}
