package com.star.app;

import org.springframework.stereotype.Component;


@Component  // We used this annotation because, spring does not create all the objects for us, we need to mention which obj we want spring to create for us. And that's where we use this annotation.

public class ForDI {
    public void code(){
        System.out.println("Msg from ForDI file");
    }
}
