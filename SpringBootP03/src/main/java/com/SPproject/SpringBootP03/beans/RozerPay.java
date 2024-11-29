package com.SPproject.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class RozerPay implements Partners{

    RozerPay()
    {
        System.out.println("RozerPay Constructor !!");
    }
    @Override
    public void payment(String amount) {
        System.out.println("RozerPay Payment Done for = "+amount);
    }
}
