package oop.d14_this;

public class Student {
    private String className;
    private String name;
    // private int age;

    public Student() {
    }

    public Student(String name) {

        this(name, "云南师范大学");
    }


    public Student(String name, String className) {

        this.className = className;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
