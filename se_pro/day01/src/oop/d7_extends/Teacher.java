package oop.d7_extends;

/**
 * @author SYX
 */
public class Teacher extends People {

    /**
    独有行为
     */
    public void teach() {
        System.out.println(getName() + "在教书");
    }


}
