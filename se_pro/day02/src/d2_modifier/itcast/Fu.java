package d2_modifier.itcast;

/**
 * 权限访问符
 *
 * @author icas-tt
 */
public class Fu {

    public static void main(String[] args) {
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }

    /**
     * 1.private：只能本类中访问
     */
    private void show1() {
        System.out.println("--------private--------");
    }


    /**
     * 2.缺失：本类，同一个包下的类能访问
     */
    void show2() {
        System.out.println("--------缺失--------");
    }

    /**
     * 3.protected：本类，同一个包下的类中，其他包下的子类
     */
    protected void show3() {
        System.out.println("--------protected--------");
    }


    /**
     * 4.public:任何地方都可以
     */
    public void show4() {
        System.out.println("--------public--------");
    }

}