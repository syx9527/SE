package d1_file_input_stream;

import java.io.*;

/**
 * @author SYX
 */
public class Test1 {

    public static void main(String[] args) {
        try {
            // InputStream f = new FileInputStream("C:/java/hello");
            File f = new File("./note/test.txt");
            InputStream in = new FileInputStream(f);
            int size = in.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) in.read() + "");
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
