package com.star.app;

import org.springframework.stereotype.Component;

@Component

public class ForDIDependent {

    public void compile() {
        System.out.println("This file is made for, what if the ForDI is dependent on some other file.");
    }
}
