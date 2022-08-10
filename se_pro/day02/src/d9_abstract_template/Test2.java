package d9_abstract_template;

/**
 * 理解模板方法模式的思想和实现步骤
 *
 * @author icas-tt
 */
public class Test2 {
    public static void main(String[] args) {
        BasetudentMiddle studentMiddle = new BasetudentMiddle();
        studentMiddle.write();
    }
}

/**
 * 学生
 */
abstract class BaseStudent {
    /**
     * 正式 声明了模板方法
     */
    public void write() {
        // 开头
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("你的爸爸是啥样，来说说");

        // 正文（每个子类都要写，但是写的内容不一样）
        System.out.println(writeMain());

        // 结尾
        System.out.println("我的爸爸简直太好了");
    }

    public abstract String writeMain();
}

class BasetudentChild extends BaseStudent {

    @Override
    public String writeMain() {
        String body = "我的爸爸敢洗碗";
        return body;
    }
}


class BasetudentMiddle extends BaseStudent {

    @Override
    public String writeMain() {
        String body = "我的爸爸能打怪兽！！";
        return body;
    }

}
