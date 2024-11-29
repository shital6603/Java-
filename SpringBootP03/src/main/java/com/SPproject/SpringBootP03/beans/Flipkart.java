package com.SPproject.SpringBootP03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

    @Value("${jdbc.url}")
    private String url;
    Flipkart()
    {
        System.out.println("Flipkart constructor!!!");
    }
    @Autowired
    Partners pat;
    public void paymentGateway(String amount)
    {
        System.out.println(url);
        pat.payment(amount);
    }
}
