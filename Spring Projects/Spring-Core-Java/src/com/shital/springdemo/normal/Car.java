package com.shital.springdemo.normal;


/*this class is is-a relationship

 */
public class Car extends Engine{
    public Car(String model) {
        super(model);
    }

    public void drive()
    {
        int start=super.start();
        if(start>=1)
        {
            System.out.println("Engine Started!!!");
        }
    }
}
