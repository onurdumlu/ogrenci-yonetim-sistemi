import java.util.ArrayList;


 public class CourseDatabase {
        private ArrayList<Course> courses;

        public CourseDatabase() {
            courses = new ArrayList<>();
        }

        public void addCourse(Course course) {
            courses.add(course);
        }

        public void removeCourse(Course course) {
            courses.remove(course);
        }

        public Course getCourse(int index) {
            return courses.get(index);
        }

        public int getNumberOfCourses() {
            return courses.size();
        }
    }
