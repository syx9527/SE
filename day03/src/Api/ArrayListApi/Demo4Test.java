package Api.ArrayListApi;

import java.util.ArrayList;

public class Demo4Test {
    public static void main(String[] args) {
        // 创建集合存储班级的成绩
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);  // [98, 77, 66, 89, 79, 50, 100]

        /*
            低于80分的成绩从集合中删去,出现问题，部分没有删掉
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < 80) {
                Integer remove = scores.remove(i);
                System.out.println(remove);
            }
        }
        */

        /*
         方法一
         for (int i = 0; i < scores.size(); i++) {
             int score = scores.get(i);
             if (score < 80) {
                 Integer remove = scores.remove(i);
                 System.out.println(remove);
                 // 删除后由于索引变化，因此该索引必须做出对应更改
                 i--;
             }
         }
        */
        // 方法二，索引从后面来
        for (int i = scores.size() - 1; i >= 0; i--) {
            int score = scores.get(i);
            if (score < 80) {
                Integer remove = scores.remove(i);
                System.out.println(remove);
            }
        }

        System.out.println(scores);
    }
}
