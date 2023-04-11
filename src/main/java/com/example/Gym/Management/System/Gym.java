package com.example.Gym.Management.System;

import java.util.ArrayList;
import java.util.List;

public class Gym {

    private int gymId;
    private String location;
    private List<Member> members;
    private List<Trainer> trainers;

    public Gym() {
    }

    public Gym(int gymId, String location, List<Member> members, List<Trainer> trainers) {
        this.gymId = gymId;
        this.location = location;
        this.members = members;
        this.trainers = trainers;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

}
