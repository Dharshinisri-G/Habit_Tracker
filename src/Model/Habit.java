package Model;

public class Habit {
    private int habitId;
    private int userId;
    private String habitName;
    private int duration;

    public Habit(int habitId,int userId,String habitName,int duration){
        this.habitId=habitId;
        this.habitName=habitName;
        this.userId=userId;
        this.duration=duration;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setHabitId(int habitId) {
        this.habitId = habitId;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public int getUserId() {
        return userId;
    }

    public int getHabitId() {
        return habitId;
    }

    public String getHabitName() {
        return habitName;
    }

    public int getDuration() {
        return duration;
    }

    public String toString() {
        return "HabitId: "+habitId+" | HabitName: "+habitName+" | Duration: "+duration;

    }
}
