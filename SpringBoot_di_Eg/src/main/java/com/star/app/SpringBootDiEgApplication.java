package com.star.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDiEgApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootDiEgApplication.class, args); // Here the run will return the obj context. Basically it means, we have a way to communicate with out IoC container.
//        System.out.println("Hello, this is my first springBoot project");

//        ForDI obj = new ForDI(); // So what if, I dont want to create this obj by myself, I want spring to create this object for me.
//        obj.code();

        // In spring obj = Bean
        // In reality what it will do it, it will create the container inside the JVM and inside the container there will be the OBJs.
        // So, you see the run, it will return the ConfigurableApplicationContext and it extends the application context. So now we will update the line 11.
        // How to communicate.
        ForDI obj1 = context.getBean(ForDI.class); // here i am assuming that the spring will create the obj for me.
        obj1.code(); // So what happening is, we have not created the obj, but spring did.

        ForDI obj2 = context.getBean(ForDI.class);
        obj2.code(); // Here it will print twice, that means we can create another obj, but the question is, the other statement, is it pointing to the obj2?
    }

}
