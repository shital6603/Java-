package com.SPproject.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class Paytm implements Partners{
    Paytm()
    {
        System.out.println("Paytm Constructor !!");
    }

    @Override
    public void payment(String amount) {
        System.out.println("Paytm Payment Done for = "+amount);
    }
}
