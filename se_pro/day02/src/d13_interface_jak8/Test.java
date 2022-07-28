package d13_interface_jak8;

interface SportMan {
    /**
     * 1.JDK8开始：默认方法（实例方法）
     * --必须default修饰，默认public修饰
     * --默认方法，接口不能创建对象，这个方法只能国际给实现类，由实现类的对象调用
     */


//    public static void inAdr() {
//        System.out.println("阿西吧");
//    }
    static void inAdr() {
        System.out.println("阿西吧");
    }

    /*
    public default void run() {
    }*/


    /**
    2.静态方法
        必须使用static修饰，默认public修饰
        --接口的静态方法，必须接口命自己调用
     */

    default void run() {
        System.out.println("冲冲冲！");
    }

    /*
    3.私有方法(实例方法)
    --JDK 1.9 开始才支持
    --必须在接口内部才能被访问
     */

    /*
        private void go() {
            System.out.println("我们走！我们走！");
        }
    */

}


class PingPongMan implements SportMan {

}

public class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();

        SportMan.inAdr();
        // PingPongMan.inAdr();
    }
}