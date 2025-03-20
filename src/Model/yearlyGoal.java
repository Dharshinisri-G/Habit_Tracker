package Model;

import Controller.TrackController;

public class yearlyGoal extends Goal{
    TrackController tc=new TrackController();

    public yearlyGoal(int goalid,int userid,int habitid,String frequency,String dailystatus,String overallstatus){
        super(goalid,userid,habitid,frequency,dailystatus,overallstatus);
    }

    public void updateoverallstatus() {
        dailystreak++;
        if(dailystreak==365){
            setOverallStatus("completed");
            //this.overallstatus="completed";
            System.out.println("Hurray! You completed ur daily task");
            tc.addreward(1,this.getUserId(),this.getGoalId(),"Bronze",100);
        }
    }
}
