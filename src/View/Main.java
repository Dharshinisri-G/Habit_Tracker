package View;

import Controller.TrackController;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TrackController tc=new TrackController();
        Scanner x=new Scanner(System.in);
        System.out.println("Welcome to Habit Tracker ");
                    System.out.print("Enter userid: ");
                    int userid=x.nextInt();
                    x.nextLine();
                    System.out.print("Enter name: ");
                    String name=x.nextLine();
                    System.out.print("Enter username: ");
                    String username=x.nextLine();
                    System.out.print("Enter password: ");
                    String password=x.nextLine();
                    System.out.print("Enter age: ");
                    int age=x.nextInt();
                    x.nextLine();
                    tc.setUser(userid,name,username,password,age);
                    tc.viewUser();
                    tc.setHabit(1,userid,"Running",10);
        tc.setHabit(2,userid,"Walking",10);
        tc.setHabit(3,userid,"Workout",30);
        tc.setHabit(4,userid,"Drinking",20);
        System.out.println("Enter userId to view ur habits: ");
        int id=x.nextInt();
        x.nextLine();
        tc.viewHabit(id);
        System.out.println("Setting Goal");
        tc.viewHabit(userid);
        System.out.println("Enter Goal id: ");
        int goalid=x.nextInt();
        x.nextLine();
        System.out.println("Enter habitId to set goal: ");
        int habid=x.nextInt();
        x.nextLine();
        System.out.println("Enter frequency (Daily/Weekly,Yearly): ");
        String frequency=x.nextLine();
        tc.setGoal(goalid,userid,habid,frequency,"Pending","Pending");
         System.out.println("Enter option to update dailystatus(1/0) : ");
         int status=x.nextInt();
         x.nextLine();
         if(status==1){

         }
    }
}
