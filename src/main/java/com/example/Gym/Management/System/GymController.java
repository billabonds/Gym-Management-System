package com.example.Gym.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GymController {

    @Autowired
    GymService gymService;


    @PostMapping("/add-Gym")
    public String addGym(@RequestBody Gym gym){

        gymService.addGym(gym);
        return "Gym added Successfully";
    }

    @PostMapping("/add-Member")
    public String addMember(@RequestBody Member member){

        gymService.addMember(member);
        return "Member added Successfully";
    }

    @PostMapping("/add-Trainer")
    public String addTrainer(@RequestBody Trainer trainer){

        gymService.addTrainer(trainer);
        return "Trainer added Successfully";
    }



    @GetMapping("/member-Most-Trainer")
    public int memberMostTrainer() {

        return gymService.memberMostTrainer();
    }

    @GetMapping("/gym-Most-No-Of-Member")
    public int gymMostNoOfMember() {

        return gymService.gymMostNoOfMember();
    }

    @GetMapping("/No-Member-Trainer-Gym-GreaterThan1")
    public int NoMemberTrainerGymGreaterThan1() {

        return gymService.NoMemberTrainerGymGreaterThan1();
    }
}
