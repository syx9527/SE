package d2_stream;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 案例一
 * 需求：  某个公司的开发部门，分为开发一部和二部，现在需要进行年终数据结算**
 * 分析：
 * 1. 员工信息至少包含了（名称、性别、工资、奖金、处罚记录）
 * 2. 开发一部有4个员工，开发二部有5名员工
 * 3. 分别山选出2个部门的最高工资的员工信息，封装成优秀员工对象TopPerformer
 * 4. 分别统计出2个部门的平均收入，要求去掉最高和最低工资
 * 5. 统计2个开发部门整体的平均工资，去掉最低和最高的平均值
 *
 * @author SYX
 */
public class StreamDemo4 {
    public static double allMoney = 0;
    public static double allMoney2 = 0;

    public static void main(String[] args) {
        //开发一部
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 30000, 25000, null));
        one.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        one.add(new Employee("沙僧", '男', 20000, 20000, null));
        one.add(new Employee("小白龙", '男', 20000, 25000, null));
        //开发二部
        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松", '男', 15000, 9000, null));
        two.add(new Employee("李逵", '男', 20000, 10000, null));
        two.add(new Employee("西门庆", '男', 50000, 100000, "被打"));
        two.add(new Employee("潘金莲", '女', 35000, 1000, "被打"));
        two.add(new Employee("武大郎", '男', 20000, 0, "被下毒"));

        // 1.开发一部的最高工资的员工
        // 制定比较大小规则
        TopPerformer t = one.stream().max(Comparator.comparingDouble(e -> e.getBonus() + e.getSalary())).map(e -> new TopPerformer(e.getName(), e.getBonus() + e.getSalary())).get();
        System.out.println(t);
        // 2.平均月收入，去掉最高工资和最低工资
        one.stream().sorted(Comparator.comparingDouble(e -> e.getBonus() + e.getSalary())).skip(1).limit(one.size() - 2).forEach(e -> {
            //求出剩余员工的工资组合
            allMoney += (e.getBonus() + e.getSalary());
        });
        System.out.println("一部员工的平均工资是:" + allMoney / (one.size() - 2));

        // 合并2个集合流，再统计
        Stream<Employee> s1 = one.stream();
        Stream<Employee> s2 = two.stream();
        Stream<Employee> s3 = Stream.concat(s1, s2);
        s3.sorted(Comparator.comparingDouble(e -> e.getBonus() + e.getSalary())).skip(1).limit(one.size() + two.size() - 2).forEach(e -> {
            //求出剩余员工的工资组合
            allMoney2 += (e.getBonus() + e.getSalary());
        });
        // BigDecimal 大数封装，解决数据过大精度缺失
        BigDecimal a = BigDecimal.valueOf(allMoney2);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size() - 2);
        System.out.println("一、二部员工的平均工资是:" + a.divide(b, 2, RoundingMode.HALF_UP));

    }
}
