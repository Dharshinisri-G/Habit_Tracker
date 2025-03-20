package Model;

public abstract class Goal {
    private int goalId;
    private int userId;
    private int habitId;
    private String frequency;
    private String dailyStatus;
    String overallStatus;
    static int dailystreak=0;

    public Goal(int goalId,int userId,int habitId,String frequency,String dailyStatus,String overallStatus){
        this.goalId=goalId;
        this.userId=userId;
        this.habitId=habitId;
        this.frequency=frequency;
        this.dailyStatus=dailyStatus;
        this.overallStatus=overallStatus;
    }
    public abstract void updateoverallstatus();

    public int getGoalId() {
        return goalId;
    }

    public int getHabitId() {
        return habitId;
    }

    public int getUserId() {
        return userId;
    }

    public String getOverallStatus() {
        return overallStatus;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setHabitId(int habitId) {
        this.habitId = habitId;
    }

    public String  getDailyStatus() {
        return dailyStatus;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public void setDailyStatus(String dailyStatus) {
        this.dailyStatus = dailyStatus;
        this.updateoverallstatus();
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String toString(){
        return "Gaolid: "+goalId+" | frequency: "+frequency+" | dailystatus: "+dailyStatus+" | overallstatus: "+overallStatus;
    }

    public void setDailystatus(String completed) {
        this.dailyStatus="Completed";

    }
}
