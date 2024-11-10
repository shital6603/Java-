package com.shital.springdemo.loosecouple;


/*this class is is-a relationship

 */
public class Car{

    IEngine enginer;

    Car(IEngine enginer)
    {
        this.enginer=enginer;
    }

    public void drive()
    {
        int start= enginer.start();
        if(start>=1)
        {
            System.out.println("Engine Started !!");
        }
        else {
            System.out.println("Engine is in trouble !!");
        }
    }
}
