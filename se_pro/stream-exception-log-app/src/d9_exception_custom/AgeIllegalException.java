package d9_exception_custom;

/**
 * 自定义异常：
 * 1. 定义一个异常类继承`Exception`
 * 2. 重写构造器
 * 3. 在出现异常的地方用`throw new`自定义对象抛出
 *
 * @author SYX
 */
public class AgeIllegalException extends Exception {
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
