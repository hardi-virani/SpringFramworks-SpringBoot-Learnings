package com.star.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component  // We used this annotation because, spring does not create all the objects for us, we need to mention which obj we want spring to create for us. And that's where we use this annotation.
public class ForDI {

    @Autowired // We used this for spring to know what we need from the other file. It is basically to connect file.
    ForDIDependent laptopobj;

    public void code()
    {
        laptopobj.compile();
//    System.out.println("Msg from ForDI file");
    }
}
