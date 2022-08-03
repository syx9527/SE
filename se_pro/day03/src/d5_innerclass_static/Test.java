package d5_innerclass_static;

import java.io.StringReader;

/**
 * 静态内部类测试
 *
 * @author 17447
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.setName("张三");
        inner.show();
    }
}

/**
 * 外部类
 */
class Outer {

    public static int a = 100;
    private String hobby;

    public Outer(String hobby) {
        this.hobby = hobby;
    }

    public static int getA() {
        return a;
    }

    public Outer() {
    }

    public static void setA(int a) {
        Outer.a = a;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * 内部类
     */
    public static class Inner {
        private String name;
        private int age;
        public static String schoolName;

        public Inner() {
        }

        /**
         * 内部类实例方法
         */
        public void show() {
            System.out.println("内部类实例方法");
            System.out.println("名称： " + name);
            System.out.println("外部类静态成员： " + a);
            // System.out.println("外部类实例成员： " + hobby);
            System.out.println("*************");
        }

        /**
         * 内部类静态方法
         */
        public static void go() {
            System.out.println("内部类静态方法");
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

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}