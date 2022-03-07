package Api.ArrayListApi;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo6Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20220301", "张三", 23, "大数据171"));
        students.add(new Student("20210302", "李四", 21, "计算机182"));
        students.add(new Student("20200303", "王五", 24, "自动化172"));
        students.add(new Student("20220304", "李鹏", 22, "自动化172"));
        System.out.println("学号" + "\t\t\t" + "姓名" + "\t\t" + "年龄" + "\t\t" + "班级");
        for (Student s : students) {
            System.out.println(s.getStudentNumber() + "\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
        }
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status) {

            System.out.println("请您输入学号查询学生对象");
            String studentNumber = sc.next();
            Student s = getStudentById(students, studentNumber);
            if (s != null) {
                System.out.println("学号" + "\t\t\t" + "姓名" + "\t\t" + "年龄" + "\t\t" + "班级");
                System.out.println(s.getStudentNumber() + "\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
                status = false;
            } else {
                System.out.println("查无此人！");

            }
        }

    }

    /**
     * 根据学生的学号查询学生对象并返回
     *
     * @param students      存储全部学生对象的集合
     * @param studentNumber 搜索学生的学号
     * @return 学生对象 | null
     */
    public static Student getStudentById(ArrayList<Student> students, String studentNumber) {
        for (Student s : students) {
            if (s.getStudentNumber().equals(studentNumber)) {
                return s;
            }
        }
        // 查无此人
        return null;
    }
}
