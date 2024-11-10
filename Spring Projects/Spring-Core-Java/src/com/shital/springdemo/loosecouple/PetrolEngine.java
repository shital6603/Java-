package com.shital.springdemo.loosecouple;

public class PetrolEngine implements IEngine{


    public int start()
    {
        System.out.println("Petrol engine started !!!");
        return 1;
    }
}
