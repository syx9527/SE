package d6_regex;

/**
 * 目标：正则表达式在方法中的应用
 * public String[] split(String regex):
 * ----按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组；
 * public String replaceAll(String regex, String newStr):
 * ----按照正则表达式匹配内容进行替换操作
 *
 * @author SYX
 */
public class RegexDemo4 {
    public static void main(String[] args) {

        String names = "小路545adaad蓉儿45asda45过儿";
        String[] arrs = names.split("\\w+");
        for (String arr : arrs) {
            System.out.println(arr);
        }

        String replace = names.replaceAll("\\w+", " ");
        System.out.println(replace);
    }
}
