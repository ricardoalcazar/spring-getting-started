package com.alcazar.springdemo;


/**
 * @Author: Ricardo Alcazar
 * @Modified: 10/12/2018
 */


public class BaseballCoach {

    private String workout;

    /**
     * Constructor
     */
    public BaseballCoach(){
        this.workout = "Spending 30 minutes on batting practice.";
    }

    /**
     * Returns the daily workout
     * @return A string
     */
    public String getDailyWorkout(){
        return workout;

    }


}
