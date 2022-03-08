package oop.d7_extends;

public class Teacher extends People {

    /*
    独有行为
     */
    public void teach() {
        System.out.println(getName() + "在教书");
    }


}
