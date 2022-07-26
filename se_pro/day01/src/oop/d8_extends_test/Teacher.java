package oop.d8_extends_test;

/**
 * @author SYX
 */
public class Teacher extends Role {
    private String clubName;

    public void outQuestions() {
        System.out.println("老师" + getName() + "发布信息！");
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}
