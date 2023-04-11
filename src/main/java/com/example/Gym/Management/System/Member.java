package com.example.Gym.Management.System;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private int memberId;
    private List<Trainer> trainers;

    private int gymId;

    public Member() {
    }

    public Member(int memberId, List<Trainer> trainers,int gymId) {
        this.memberId = memberId;
        this.trainers = trainers;
        this.gymId = gymId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }
}
