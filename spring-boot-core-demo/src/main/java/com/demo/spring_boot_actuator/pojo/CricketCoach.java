package com.demo.spring_boot_actuator.pojo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Primary    // however since @Qualifier is used in football coach it is preferred
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements  Coach{


    @Override
    public String dailyWorkout() {
        return "practise fielding for 10 mins everyday";
    }

    @Override
    public String getCoachName() {
        return "Gautam Gambhir";
    }


    @PostConstruct
    private  void postConstruct(){
        System.out.println("postContruct");
    }

    @PreDestroy
    private void preDestroy(){
        System.out.println("predestroy");
    }

    
}
