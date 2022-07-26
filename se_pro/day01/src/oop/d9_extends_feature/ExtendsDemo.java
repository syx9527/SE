package oop.d9_extends_feature;


/**
 * @author SYX
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        // System.out.println(s.age);
        // s.run();
        int a = Student.onlineNumber = 5;
        System.out.println(Student.onlineNumber);
        System.out.println(People.onlineNumber);
        System.out.println(s.getAge());
        Student.inAdr( );
    }
}

class People {
    public static int onlineNumber;
    private int age = 21;

    public static void inAdr() {
        System.out.println("卷起来~");
    }

    public People() {
    }

    private void run() {
        System.out.println("人跑的很快");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends People {

}