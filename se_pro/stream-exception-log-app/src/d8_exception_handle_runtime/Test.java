package d8_exception_handle_runtime;

/**
 * 目标：运行时异常的处理机制
 * -
 * - 运行时异常编译阶段不会出错，是运行时才可能出错，所以编译阶段不处理也可以。
 * - 按照规范建议还是处理：建议在最外层调用处理集中捕获处理即可。
 *
 * @author SYX
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("start……");
        try {
            device(10, 2);
            device(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("over!");
    }

    public static void device(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }

}
