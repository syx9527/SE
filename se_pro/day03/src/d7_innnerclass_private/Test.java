package d7_innnerclass_private;

/**
 * 目标：了解静态内部类的语法
 *
 * @author 17447
 */
public class Test {
    static {
        class Dog {
        }
        abstract class Animal {
        }
        // 不能定义接口
        // interface SportMan{}
    }

    public static void main(String[] args) {


        class Cat {
            private String name;

            // JDK 8不支持，JDK 16开始支持
            // public static int onLineNumber = 100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Cat c = new Cat();
        c.setName("波肥猫");
    }
}
