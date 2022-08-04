package d6_regex;

/**
 * 正则表达式可以用一些规定的字符来指定规则，并用来校验数据格式的合法性。
 * 校验一个QQ号码石佛正确，6-20位，必须全部是数字
 */

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQq("01234567890123456789"));
        System.out.println(checkQq("5454"));
        System.out.println(checkQq("asdad4545"));
        System.out.println(checkQq(null));
        System.out.println(checkQq("44545454544545545454545454456"));

        System.out.println("-------------");

        System.out.println(checkQq2("54545454"));
        System.out.println(checkQq2("5454"));
        System.out.println(checkQq2("asdad4545"));
        System.out.println(checkQq2(null));
        System.out.println(checkQq2("44545454544545545454545454456"));

    }

    public static boolean checkQq2(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQq(String qq) {
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            // 获取每位字符
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

}
