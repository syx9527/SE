package d13_api_system;

/**
 * 系统api
 *
 * @author 17447
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        // JVM终止
        // System.exit(0);
        System.out.println("程序结束……");

        long time = System.currentTimeMillis();
        System.out.println(time);

        // 数组拷贝
        /*
        arraycopy(Object src, int srcPos, Object dest,int destPos, int length);
        参数一：
        参数二：
        参数三：
        参数四：
        参数五：
         */
        int[] arr1 = {10, 20, 30, 40, 60, 70};
        int[] arr2 = new int[6];

    }
}
