package org.example;

public class Parent {
    flower flwr;
    public void setMeth(flower flwr)
    {
        this.flwr=flwr;
    }
    public void access()
    {
        System.out.println(flwr);
    }
}
