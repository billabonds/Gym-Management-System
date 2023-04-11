package com.example.Gym.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GymService {

    @Autowired
    GymRepository gymRepository;

    public void addGym(Gym gym){
        gymRepository.addGym(gym);
    }

    public void addMember(Member member){
        gymRepository.addMember(member);
    }

    public void addTrainer(Trainer trainer){
        gymRepository.addTrainer(trainer);
    }

    public int memberMostTrainer()                                               // 1. API
    {
        return gymRepository.memberMostTrainer();
    }

    public int gymMostNoOfMember()                                               // 3. API
    {
        return gymRepository.gymMostNoOfMember();
    }

    public int NoMemberTrainerGymGreaterThan1()                                  // 2. API
    {
        return gymRepository.NoMemberTrainerGymGreaterThan1();
    }
}
