package oop.d8_extends_test;

/**
 * @author SYX
 */
public class Role {
    private String name;
    private int age;

    /**
     * 定义共同的行为
     */
    public void queryCourse() {
        System.out.println(name + "开始查看课程信息~~");
    }

    public Role() {
    }

    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
