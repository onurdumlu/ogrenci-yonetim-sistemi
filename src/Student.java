public class Student {
    private String name;
    private String studentID;
    private String department;
    private String register;

    public Student(String name, String studentID, String department, String register) {
        this.name = name;
        this.studentID = studentID;
        this.department = department;
        this.register = register;

    }

    // getter ve setter yöntemleri buraya

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }
}