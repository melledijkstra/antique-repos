/**
 * Created by melle_000 on 2015-11-10.
 */
public class Program {
    public static void main(String args[]) {

        Administratie admin = new Administratie();
        Student student1 = new Student("Melle","09-03-1998");
        Student student2 = new Student("Robin","02-04-1996");
        Student student3 = new Student("Rick","24-01-1992");

        student1.addTentamen();

        admin.addStudent(student1);
        admin.addStudent(student2);
        admin.addStudent(student3);

    }
}
