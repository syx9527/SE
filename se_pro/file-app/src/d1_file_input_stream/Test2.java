package d1_file_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author SYX
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            File f = new File("file-app/src/d1_file_input_stream/Test1.java");
            FileInputStream fip = new FileInputStream(f);
            // 构建FileInputStream对象

            InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8);
            // 构建InputStreamReader对象,编码与写入相同

            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append((char) reader.read());
                // 转成char加到StringBuffer对象中
            }
            System.out.println(sb);
            reader.close();
            // 关闭读取流

            fip.close();
            // 关闭输入流,释放系统资源
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
