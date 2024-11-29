package com.SPproject.SpringBootP03.beans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JustPay implements Partners{
    JustPay()
    {
        System.out.println("Justpay Constructor !!");
    }

    @Override
    public void payment(String amount) {

        System.out.println("Justpay Payment Done for = "+amount);
    }
}
