package Model;

public class rewards {
    private int rewardid;
    private int userid;
    private int goalid;
    private String level;
    private int points;

    public rewards(int rewardid,int userid,int goalid,String level,int points){
        this.goalid=goalid;
        this.rewardid=rewardid;
        this.level=level;
        this.points=points;
        this.userid=userid;
    }

    public String toString() {
        return "rewardId: "+rewardid+" | level: "+level;
    }
}
