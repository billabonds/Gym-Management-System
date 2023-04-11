package com.example.Gym.Management.System;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class GymRepository {

    // Question :
            //    Create a Gym Management System :--
            //
            //    Gym: GymId, Location, List<Members>, List<Trainers>
            //    Member: MemberId, List<Trainer>,Gym
            //    Trainer: TrainerId, List<Member>, List<Gym>
            //
            //    POST: Add Gym, Member, Trainer
            //
            //  1. Find the member which is being trained by the most number of trainers.
            //  2. Find the number of members who are being trained by a trainer working in more than 1 gym.
            //  3. Find the gym with the most number of members.

    HashMap<Integer,Gym> gymDb = new HashMap<>();
    HashMap<Integer,Member> memberDb = new HashMap<>();
    HashMap<Integer,Trainer> trainerDb = new HashMap<>();

    public void addGym(Gym gym){
        gymDb.put(gym.getGymId(),gym);
    }

    public void addMember(Member member){
        memberDb.put(member.getMemberId(),member);
    }

    public void addTrainer(Trainer trainer){
        trainerDb.put(trainer.getTrainerId(),trainer);
    }

    public int memberMostTrainer()                                               // 1. API
    {
        int ans = 0;
        int max = 0;

        for(int memberId : memberDb.keySet())
        {
            if(max < memberDb.get(memberId).getTrainers().size())
            {
                ans = memberId;
                max = memberDb.get(memberId).getTrainers().size();
            }
        }
        return ans;
    }

    public int gymMostNoOfMember()                                               // 3. API
    {
        int ans = 0,max = 0;

        for(int gymId : gymDb.keySet())
        {
            if(max < gymDb.get(gymId).getMembers().size())
            {
                ans = gymId;
                max = gymDb.get(gymId).getMembers().size();
            }
        }
        return ans;
    }

    public int NoMemberTrainerGymGreaterThan1()                                  // 2. API
    {
        //  2. Find the number of members who are being trained by a trainer working in more than 1 gym.
        int count = 0;

        for(int memberId : memberDb.keySet())
        {
            List<Trainer> trainers = memberDb.get(memberId).getTrainers();

            for(Trainer trainer : trainers)
            {
                if(trainer.getGyms().size() > 1)
                {
                    count++;
                    break;
                }
            }

        }

        return count;
    }

}


