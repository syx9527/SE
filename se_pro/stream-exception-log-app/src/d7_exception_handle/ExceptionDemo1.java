package d7_exception_handle;

/**
 * 异常的默认处理流程
 * -
 * 1. 默认会在出现异常的代码处自动创建一个异常对象：`ArithmeticException`。
 * 2. 异常会从方法中出现的点这里抛出给调用者，调用者最总抛出给JVM虚拟机
 * 3. 虚拟机接收到异常对象后，现在控制台直接输出异常栈信息数据。
 * 4. 直接从当前执行的异常点单调当前程序。
 * 5. 后续代码不再执行。
 *
 * @author SYX
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {

    }
}
