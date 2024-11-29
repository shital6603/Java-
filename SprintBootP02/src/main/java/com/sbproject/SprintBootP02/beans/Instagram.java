package com.sbproject.SprintBootP02.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Instagram {
    @Autowired
    Reels reels;

    LocalDateTime localDateTime;

    public void play()
    {
        System.out.println("Login at :"+localDateTime);
        reels.dance();
    }
}
