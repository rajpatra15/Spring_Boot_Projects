package com.demo.spring_boot_actuator.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("footballcoach")
public class FootballCoach implements  Coach{
    @Override
    public String dailyWorkout() {
        return "Practise shooting for 30  minutes";
    }

    @Override
    public String getCoachName() {
        return "Mikel Arteta";
    }
}
