package d9_abstract_template;

public class Test {
    public static void main(String[] args) {
        CurrentAccount acc = new CurrentAccount("ICBC9527", 1000);
        acc.handle("admin", "123456");

    }
}
