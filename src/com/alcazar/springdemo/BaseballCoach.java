package com.alcazar.springdemo;


public class BaseballCoach implements Coach {

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
    @Override
    public String getDailyWorkout(){
        return workout;

    }


}
