package Model;
import Controller.TrackController;

public class dailyGoal extends Goal  {
     TrackController tc=new TrackController();

     public dailyGoal(int goalid,int userid,int habitid,String frequency,String dailystatus,String overallstatus){
         super(goalid,userid,habitid,frequency,dailystatus,overallstatus);
     }

    public void updateoverallstatus() {
        dailystreak++;
        if(dailystreak==1){
           // setOverallStatus("completed");
           this.overallStatus="completed";
            System.out.println("Hurray! You completed ur daily task");
           tc.addreward(1,this.getUserId(),this.getGoalId(),"Bronze",100);
        }
    }
}
