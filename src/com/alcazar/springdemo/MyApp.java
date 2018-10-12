package com.alcazar.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyApp {

    private static Logger logger = LoggerFactory.getLogger(MyApp.class);


    /**
     * Main application
     * @param args default arguments
     */
    public static void main(String[] args){

        logger.info("Running MyApp.main()");

        // create the object
        BaseballCoach theCoach = new BaseballCoach();

        // use the object
        logger.info(theCoach.getDailyWorkout());


        logger.info("MyApp.main() finished.");

    }



}
