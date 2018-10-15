package com.alcazar.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    private static Logger logger = LoggerFactory.getLogger(HelloSpringApp.class);

    public static void main (String[] args){

        // load spring configuration file
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        // retrieve bean from container
        Coach theCoach = ctx.getBean("myCoach", Coach.class);

        // call methods on bean
        logger.info("Daily workout is: " + theCoach.getDailyWorkout());


        // close application context
        ctx.close();


    }
}
