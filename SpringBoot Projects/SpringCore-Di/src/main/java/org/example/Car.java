package org.example;

public class Car {
    Car()
    {
        System.out.println("Car Constructor!!");
    }
    Car(IEngine engine)
    {
        this.engine=engine;
    }
    IEngine engine;
    public void setEngine(IEngine engine) {

        this.engine = engine;
    }

    public void drive()
    {

        System.out.println("");
    }

}
