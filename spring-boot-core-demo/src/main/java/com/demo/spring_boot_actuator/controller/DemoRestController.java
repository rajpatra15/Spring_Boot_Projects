package com.demo.spring_boot_actuator.controller;

import com.demo.spring_boot_actuator.pojo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    Coach myCoach;
    String name;


//    @Autowired
//    DemoRestController(@Qualifier("footballcoach") Coach theCoach) {
//        myCoach = theCoach;
//    }

    @Autowired
    public void setCoach( Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyWorkout")
    public String  getDailyWorkout() {
        return myCoach.dailyWorkout();
    }

    @GetMapping("/coachname")
    public String getCoachName(){
        return "Coach name is :"+ myCoach.getCoachName();
    }
}



