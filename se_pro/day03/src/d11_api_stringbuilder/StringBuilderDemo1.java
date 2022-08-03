package d11_api_stringbuilder;

/**
 * 目标：学会使用StringBuilder操作字符串，最终还需要知道它性能好的原因
 *
 * @author 17447
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        stringBuilder.append("d");
        stringBuilder.append("e");
        stringBuilder.append(false);
        stringBuilder.append(3.3);
        stringBuilder.append("abc");
        System.out.println(stringBuilder);
        System.out.println("------------");

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("a").append("C").append("opq++");

        // 反转内容
        stringBuilder1.reverse().append(9524);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.length());

        /*
        注意：StringBuilder只是拼接字符串的手段，效率好
        最终结果还是恢复成String类型
         */
        // 恢复成String
        String res = stringBuilder1.toString();
        check(res);
    }

    public static void check(String data) {
        System.out.println(data);
    }
}
