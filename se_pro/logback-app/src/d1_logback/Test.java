package d1_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 目标：快速搭建logback日志框架记录日志执行情况，到控制台、文件、数据库
 *
 * @author SYX
 */
public class Test {
    // 创建logback日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        int i = 1;
        while (i > 0) {
            try {
                LOGGER.debug("main开始执行");
                LOGGER.info("开始记录info日志，做除法");
                int a = 10, b = 0;

                LOGGER.trace("a=" + a);
                LOGGER.trace("b=" + b);

                System.out.println(a / b);
            } catch (Exception e) {
                // e.printStackTrace();
                LOGGER.error("功能出现异常 " + e);
            }
            i--;
        }


    }
}
