package oop.d11_extends_method_override;

public class newPhone extends Phone {
    @Override
    public void call() {
        super.call();
        System.out.println("支持视频通话");
    }

    @Override
    public void sendMassage() {
        super.sendMassage();
        System.out.println("发送表情信息");
    }

    /*
    @Override
    public static void test() {}
    */
}
