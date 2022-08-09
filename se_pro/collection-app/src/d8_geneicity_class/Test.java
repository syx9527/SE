package d8_geneicity_class;

/**
 * 需求：模拟ArrayList定义一个MyArrayList，关注泛型设计
 *
 * @author SLJ
 */
public class Test {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("s");
        list.add("y");
        list.add("x");

        System.out.println(list);

        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(23);
        integerMyArrayList.add(25);
        integerMyArrayList.add(12);
        integerMyArrayList.remove(25);
        System.out.println(integerMyArrayList);

    }
}
