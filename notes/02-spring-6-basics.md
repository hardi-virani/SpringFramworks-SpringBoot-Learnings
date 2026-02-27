Vist

spring.io -> you will get to learn so many things about spring framwork and springBoot

So we will start from spring framework and then move towards SpringBoot.

If you want to see official documentation about spring search -> spring docs and visit -> spring framework documentation.

Prerequites -> Core java concepts. like: 

1. Java syntax.
2. OOPS concept.
3. Exception handling
4. Threads (not that imp but basic are imp.)
5. Collection API
6. Knowledge on JDBC (java database connectivity) because when you are working with JDBC you are working with data and for data you need to know the database connectivity. And for that you need to know JDBC.
7. Spring project you need to know build tool -> which is Maven and Gradle. (For this learning we are going to work on MAVEN).
8. We are also going to work with spring ORM and for that we need to know Hibernate or ORM knowledge is imp.

So for the software, I have use intellij Idea, you can use eclipse or anything you like. 

Before starting spring framework, we need to understand: 
IoC (Inversion of control) -> Basically means inverting a control. (but where?)-> As a developer we create the object, maintain the obj, destroy the obj, but the problem starts with we are not focusing on the main thing. So as a programer our focus should be the busineess logic not obj creation. So we are giving the control to Other to focus on main business logic. So we are giving control to someone else, that is inverting the control. 
DI (Dependency injection)


IoC (Inversion of control) 
IoC is basically a principle that you follow. 
Basically means inverting a control. (but where?)-> As a developer we create the object, maintain the obj, destroy the obj, but the problem starts with we are not focusing on the main thing. So as a programer our focus should be the busineess logic not obj creation. So we are giving the control to Other to focus on main business logic. So we are giving control to someone else, that is inverting the control. 
Now to use IoC we need IoC container, spring works in container. So technically, spring will create the obj for you, inside IoC container we will be having our objs. 
So in order to make this work, we need a design pattern called DI. where we have the object in the container but someone has to inject them in to your applicaiton.

Basically in IoC container we have two different objs, but in order to connect that we need DI.

We use Design pattern DI, to implement IoC principle. 

Here, we are going to create the springBoot app (so we can see how easy it is) and then see what happens behind the scenes in spring Framework. 

We will see the simple example of DI. 


