package com.shital.springdemo.DI;


import com.shital.springdemo.loosecouple.IEngine;

/*this class is is-a relationship

 */
public class CarDI {



    IEngine enginer;




   /* public void setEnginer(IEngine enginer) {
        this.enginer = enginer;
    }*/



    // Constructor dependency
   /* public CarDI(IEngine enginer){
        this.enginer=enginer;
    }*/

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
