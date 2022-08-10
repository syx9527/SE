package d6_innerclass;

/**
 * 实现内部类各个变量的输出测试
 *
 * @author 17447
 */
public class Test2 {
    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }


}

class People {
    private int heartbeat = 150;

    public class Heart {
        private int heartbeat = 110;

        public void show() {
            int heartbeat = 78;
            System.out.println(heartbeat); //78
            System.out.println(this.heartbeat); //110
            System.out.println(People.this.heartbeat); //150
        }
    }
}
