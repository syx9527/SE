package d2_file_test;

import java.io.File;
import java.util.ArrayList;

/**
 * 删除目录或文件
 * -
 * 删除文件可以使用 java.io.File.delete() 方法。
 * 以下代码会删除目录 /tmp/java/，需要注意的是当删除某一目录时，必须保证该目录下没有其他文件才能正确删除，否则将删除失败。
 * 测试目录结构：
 * ./tmp/java/
 * |-- 1.log
 * |-- test
 *
 * @author SYX
 */
public class DirTest3 {
    public static void main(String[] args) {
        // 这里为测试目录
        File folder = new File("tmp/java/");
        deleteFolder(folder);
    }

    /**
     * 删除文件及目录
     *
     * @param folder 需要删除的目录
     */
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    boolean delete = f.delete();
                }
            }
        }
        boolean delete = folder.delete();



    }
}
