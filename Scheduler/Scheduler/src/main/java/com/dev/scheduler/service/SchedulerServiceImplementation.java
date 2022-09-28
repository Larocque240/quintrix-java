package com.dev.scheduler.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

import com.dev.scheduler.dao.UserDao;
import com.dev.scheduler.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerServiceImplementation {

    @Autowired
    private UserDao dao;

    @Scheduled(cron="* */5 * * * *")//for every 5 mintues


    public void Display() {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Scheduling for every 5 minutes");
    }

    public void addTask() {
        User user = new User();
        user.setName("user"+ new Random().nextInt(3000));
        dao.save(user);
        System.out.println("add service call in " + new Date().toString());

    }

    public void getJob(){

    }


}
