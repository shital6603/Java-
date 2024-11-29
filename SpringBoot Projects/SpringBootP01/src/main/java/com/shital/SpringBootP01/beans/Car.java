package com.shital.SpringBootP01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    IEngine petrol;
    public void m1()
    {
        petrol.start();
    }
}
