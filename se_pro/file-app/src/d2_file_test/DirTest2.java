package d2_file_test;

import java.io.File;

/**
 * 读取目录
 * -
 * 一个目录其实就是一个 File 对象，它包含其他文件和文件夹。
 * 如果创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true。
 * 可以通过调用该对象上的 list() 方法，来提取它包含的文件和文件夹的列表。
 * 下面展示的例子说明如何使用 list() 方法来检查一个文件夹中包含的内容：
 *
 * @author SYX
 */
public class DirTest2 {
    public static void main(String[] args) {
        String dirname = "file-app/src/d2_file_test";
        File f = new File(dirname);

        if (f.isDirectory()) {
            System.out.println("目录 " + dirname);
            String[] s = f.list();
            for (String s1 : s) {
                if (new File(dirname + "/" + s1).isDirectory()) {
                    System.out.println(s1 + "目录");
                } else {
                    System.out.println(s1 + "文件");
                }
            }
        } else {
            System.out.println(dirname + "不是一个目录");
        }

    }
}
