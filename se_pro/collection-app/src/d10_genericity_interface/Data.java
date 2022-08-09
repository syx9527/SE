package d10_genericity_interface;

/**
 * 操作老师数据和学生数据
 *
 * @author SLJ
 */
public interface Data<E> {
    /**
     * 增加
     *
     * @param e
     */
    void add(E e);

    /**
     * 删除
     *
     * @param id
     */
    void delete(int id);

    /**
     * 修改
     *
     * @param e
     */
    void update(E e);

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    E queryByID(int id);
}
