package d9_exception_custom;

/**
 * 1. 自定义编译时异常
 * -
 * -   1. 定义一个异常类继承`Exception`
 * -   2. 重写构造器
 * -   3. 在出现异常的地方用`throw new`自定义对象抛出
 * -   编译时异常是编译阶段就报错，提醒更加强烈，一定要处理。
 * -------------
 * 2. 自定义运行时异常、
 * -
 * -   1. 定义一个异常类继承`RuntimeException`
 * -   2. 重写构造器
 * -  3. 在出现异常的地方用`throw new`自定义对象抛出
 * -  提醒不强烈，编译阶段不报错！运行时才可能出错。
 * ---------------
 * 需求：
 * -    认为年龄小于0岁，或者大于200岁即为异常
 *
 * @author SYX
 */
public class ExceptionDemo {
    public final static int MAX_AGE = 200;
    public final static int MI_AGE = 0;

    public static void main(String[] args) {
        try {
            checkAge(-34);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
        // 编译阶段不报错
        checkAge2(-34);
    }

    public static void checkAge(int age) throws AgeIllegalException {
        if (age < MI_AGE || age > MAX_AGE) {
            // 抛出异常对象
            // throw：在方法内部直接创建一个异常对象，并从此点抛出
            // throws：用在方法申明上，抛出方法内部的异常
            throw new AgeIllegalException(age + " is illegal!");
        } else {
            System.out.println("年龄合法：奖励一个大笔都");
        }
    }

    public static void checkAge2(int age) {
        if (age < MI_AGE || age > MAX_AGE) {
            throw new AgeIllegalRuntimeException(age + " is illegal!");
        } else {
            System.out.println("年龄合法：奖励一个大笔都");
        }
    }
}
