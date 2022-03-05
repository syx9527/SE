package Api.StringApi;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("----------------");
        String name = "云南";
        byte[] b = {97};
        String names = new String(b);

        System.out.println(name);
        System.out.println(names);
        System.out.println("----------------");

        String ss1 = "op";
        String ss2 = "op";
        System.out.println(ss1 == ss2);

        String ss3 = new String("op");
        String ss4 = new String("op");
        System.out.println(ss3 == ss4);
        System.out.println(ss3.equals(ss4));
        System.out.println("----------------");


    }
}
