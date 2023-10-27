import java.util.ArrayList;

public class StudentDatabase {
    private ArrayList<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public int getNumberOfStudents() {
        return students.size();
    }
}