package Model;

public class User {
    private int userId;
    private String name;
    private String userName;
    private String password;
    private int age;

    public User(int userId, String name, String userName, String password, int age) {
        this.userId = userId;
        this.userName = userName;
        this.name=name;
        this.password=password;
        this.age=age;
    }
    public int getUserId(){return userId;}
    public int getAge(){return age;}
    public String getName(){return name;}
    public String getUserName(){return userName;}
    public String getPassword(){return password;}

    public void setUserId(int UserId){userId=userId;}
    public void setName(String Name){name=Name;}
    public void setUserName(String UserName){userName=UserName;}
    public void setPassword(String Password){password=Password;}
    public void setAge(int Age){age=Age;}

    public String toString(){
        return "UserId: "+userId+" | Username: "+userName+" | Name: "+name+" | Age: "+age;
    }
}
