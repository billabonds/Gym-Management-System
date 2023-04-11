package com.example.Gym.Management.System;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private int trainerId;
    private List<Member> members;
    private List<Gym> gyms;

    public Trainer() {
    }

    public Trainer(int trainerId, List<Member> members, List<Gym> gyms) {
        this.trainerId = trainerId;
        this.members = members;
        this.gyms = gyms;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Gym> getGyms() {
        return gyms;
    }
}
