package oop.d8_extends_test;

/**
 * @author SYX
 */
public class Student extends Role {
    private String className;

    public void writeInfo() {
        System.out.println("学生" + getName() + "填写信息");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
