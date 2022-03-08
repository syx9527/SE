package oop.d7_extends;

public class Student extends People {


    /*
    独有行为
     */
    public void study() {
        System.out.println(getName() + "在学习");
    }

}
