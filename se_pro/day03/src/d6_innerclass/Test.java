package d6_innerclass;

/**
 * 成员内部类测试
 *
 * @author 17447
 */
public class Test {
    public static void main(String[] args) {
        /*
        成员内部类创建对象的格式：
        格式：外部类.内部类 对象名 = new 外部类构造器.new 内部类构造器();
        范例：Outer.Inner i = new Outer().new Inner();
         */
        Outer.Inner i = new Outer().new Inner();
        i.setName("内部");
        i.show();
        System.out.println("-------------");

        Outer.Inner i2 = new Outer("爱打篮球").new Inner();
        i2.show();
    }
}

/**
 * 外部类
 */
class Outer {
    public static int num = 111;
    private String hobby;

    public Outer() {
    }

    public Outer(String hobby) {
        this.hobby = hobby;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Outer.num = num;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * 成员内部类,
     */
    public class Inner {
        private String name;
        private int age;


        public void show() {
            System.out.println((this.name != null ? this.name + "\n" : "") + "show: 100");
            System.out.println("数量: " + num);
            System.out.println("爱好: " + hobby);
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

        // 不能加static修饰，jdk16之前不能添加静态成员变量
        // public static int A;
        // 静态方法也不行
        // public static void test() {}
    }
}