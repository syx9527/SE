package d8_geneicity_class;

import java.util.ArrayList;

/**
 * 泛型
 *
 * @author SLJ
 */
public class MyArrayList<E> {
    private ArrayList lists = new ArrayList();

    public void add(E e) {
        lists.add(e);
    }

    public void remove(E e) {
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
