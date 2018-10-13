package com.alcazar.springdemo;

public class SoccerCoach implements Coach{

    private String workout;


    public SoccerCoach(){
        this.workout = "Score goals all day long.";
    }


    @Override
    public String getDailyWorkout(){

        return workout;
    }

}
