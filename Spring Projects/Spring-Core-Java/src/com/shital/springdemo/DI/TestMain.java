package com.shital.springdemo.DI;

import com.shital.springdemo.loosecouple.PetrolEngine;

import java.lang.reflect.Field;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        //CarDI car =new CarDI();
        //car.setEnginer(new PetrolEngine());
        //car.drive();


        //Reflection API
        Class<?> aClass=Class.forName("com.shital.springdemo.DI.CarDI");
        Field field=aClass.getDeclaredField("enginer");
        field.setAccessible(true);
        Object instance=aClass.newInstance();
        CarDI carDI =(CarDI) instance;

        //carDI.setEnginer(new PetrolEngine());
        field.set(carDI,new PetrolEngine());
        carDI.drive();
    }
}
