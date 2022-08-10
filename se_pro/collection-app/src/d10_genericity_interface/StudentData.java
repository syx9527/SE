package d10_genericity_interface;

/**
 * @author SLJ
 */
public class StudentData implements Data<Student> {

    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student queryByID(int id) {
        return null;
    }
}
