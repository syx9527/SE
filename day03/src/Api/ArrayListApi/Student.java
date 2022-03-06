package Api.ArrayListApi;

public class Student {
    private String studentNumber;
    private String name;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String studentNumber, String name, int age, String className) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
