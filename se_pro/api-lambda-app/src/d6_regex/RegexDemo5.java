package d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则匹配爬取信息
 *
 * @author SYX
 */
public class RegexDemo5 {
    public static void main(String[] args) {
        String rs = "昆明理工大学，教务处电话020-41301231，020-1021142，或联系邮箱kmustjwc@kmust.edu.cn,招生办400-600454，400564123,17665478523";


        // 1.定义爬取规则
        String regex = "(\\w+@[a-zA-Z0-9]*(\\.[a-zA-Z0-9]*){1,2})|(1[3-9]\\d{9})|(0\\d{1,5}-?\\d{4,20})|(400-?\\d{4,20})";


        // 2.把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        // 3.得到一个内容匹配对象
        Matcher matcher = pattern.matcher(rs);

        // 4.开始找：！！！
        while (matcher.find()) {
            String res = matcher.group();
            System.out.println(res);
        }
    }
}
