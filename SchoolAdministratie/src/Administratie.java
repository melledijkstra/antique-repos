import java.util.ArrayList;

/**
 * Created by Melle Dijkstra on 2015-11-10.
 */
public class Administratie {

    private ArrayList<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public Student getStudentById(int index) {
        return this.studentList.get(index);
    }
}
