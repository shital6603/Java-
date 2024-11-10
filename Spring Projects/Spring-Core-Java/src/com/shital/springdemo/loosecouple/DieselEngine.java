package com.shital.springdemo.loosecouple;

public class DieselEngine implements IEngine{

    String modelName;

    public DieselEngine(String modelName)
    {
        this.modelName=modelName;
    }

    @Override
    public int start()
    {
        System.out.println("Diesel engine started !!!");
        return 1;
    }
}
