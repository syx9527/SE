package d9_api_object;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

/**
 * 目标：掌握Object类中equals方法的使用
 *
 * @author 17447
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("王传", '男', 23);
        Student s2 = new Student("王传", '男', 23);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
    }
}
