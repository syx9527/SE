package Api.StringApi;

import java.util.Random;

public class Demo6 {
    public static void main(String[] args) {
        String data = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(data.length());

            char c = data.charAt(index);
            code += c;

        }
        System.out.println(code);
    }
}
