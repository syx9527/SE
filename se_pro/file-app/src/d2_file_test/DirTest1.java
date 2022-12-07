package d2_file_test;

import java.io.File;

/**
 * 创建文件夹
 * File类中有两个方法可以用来创建文件夹：
 * -
 * mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
 * mkdirs()方法创建一个文件夹和它的所有父文件夹。
 *
 * @author SYX
 */
public class DirTest1 {
    public static void main(String[] args) {
        String dirName = "file-app/src/d2_file_test/test_dir/dirs";
        File f = new File(dirName);
        f.mkdirs();  //boolean
    }
}
