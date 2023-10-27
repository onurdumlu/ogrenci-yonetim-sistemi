public class Course {
    private String name;
    private String courseID;
    private String semester;

    public Course(String name, String courseID, String semester) {
        this.name = name;
        this.courseID = courseID;
        this.semester = semester;
    }

    // getter ve setter yöntemleri buraya

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}