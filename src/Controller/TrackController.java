package Controller;

import Model.*;

import java.util.*;

public class TrackController {
    Map<Integer, User>  userMap=new HashMap<>();
    Map<Integer, List<Habit>> habitMap=new HashMap<>();
    Map<Integer, List<Goal>> goalMap=new HashMap<>();
    Map<Integer, List<rewards>> rewardMap=new HashMap<>();
    User user;
    Habit habit;
    Goal goal;
    rewards reward;
    public void setUser(int userid,String name,String username,String password,int age){
        user=new User(userid,name,username,password,age);
        userMap.put(userid,user);
        System.out.println("Hi! "+username+". You are successfully logged In.");
    }
    public void viewUser(){
        for(Map.Entry<Integer, User> e:userMap.entrySet()){
            System.out.println(e.getValue());
        }
    }
    public void setHabit(int habitid,int userid,String habitname,int duration){
        habit=new Habit(habitid,userid,habitname,duration);
        habitMap.putIfAbsent(userid,new ArrayList<>());
        habitMap.get(userid).add(habit);
    }
    public void viewHabit(int userid){
        if(habitMap.containsKey(userid)){
            for(Habit habit:habitMap.get(userid)){
                System.out.println(habit);
            }
        }
        else{
            System.out.println("No habits found");
        }
    }
    public void setGoal(int goalid,int userid,int habitid,String frequency,String dailystatus,String overallstatus){
        switch(frequency.toLowerCase()){
            case "daily":
                goal=new dailyGoal(goalid,userid,habitid,frequency,dailystatus,overallstatus);
                break;
//            case "weekly":
//                goal=new weeklyGoal(goalid,userid,habitid,frequency,dailystatus,overallstatus);
//                break;
//            case "yearly":
//                goal=new yearlyGoal(goalid,userid,habitid,frequency,dailystatus,overallstatus);
//                break;
        }
        goalMap.putIfAbsent(userid,new ArrayList<>());
        goalMap.get(userid).add(goal);
        System.out.println("Goal added successfully");
    }
    public void addreward(int rewardid,int userid,int goalid,String level,int points){
        reward=new rewards(rewardid,userid,goalid,level,points);
        rewardMap.putIfAbsent(userid,new ArrayList<>());
        rewardMap.get(userid).add(reward);
    }

    public void status(int userId){
        if (goalMap.containsKey(userId)) {
            for (Goal goal : goalMap.get(userId)) {
                goal.setDailystatus("Completed");
            }
        } else {
            System.out.println("No goals found for this user.");
        }
    }
}
