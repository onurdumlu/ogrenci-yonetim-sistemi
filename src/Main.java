public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();

        // Öğrenci ekleme
        database.addStudent(new Student("Alice", "12345", "Computer Science", "2023"));
        database.addStudent(new Student("Bob", "23456", "Mechanical Engineering", "2022"));

        // Eklenen öğrencilerin bilgilerini alma
        System.out.println("Number of students: " + database.getNumberOfStudents());
        for (int i = 0; i < database.getNumberOfStudents(); i++) {
            Student student = database.getStudent(i);
            System.out.println("Student " + (i + 1) + ": " + student.getName() + ", " + student.getStudentID() + ", " + student.getDepartment() + ","+ student.getRegister());
        }
    }
}