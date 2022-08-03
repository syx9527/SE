package d9_api_object;

/**
 * 掌握 Object 中toString() 方法
 *
 * @author 17447
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("王传", '男', 23);
        String rs = s1.toString();
        System.out.println(rs);
    }
}
