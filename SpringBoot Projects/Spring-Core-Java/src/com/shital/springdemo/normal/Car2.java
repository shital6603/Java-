package com.shital.springdemo;

/**
    this class is has-a relation
 */

public class Car2{
    void drive()
    {
        Engine engine=new Engine("2023");
        int start=engine.start();
        if(start>=1)
        {
            System.out.println("Engine Started !!!");
        }
    }
}
