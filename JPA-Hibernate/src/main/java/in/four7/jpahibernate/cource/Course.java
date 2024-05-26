package in.four7.jpahibernate.cource;

/**
 * This class represents a Course entity with properties like courseId, courseName, and courseAuther.
 * It includes constructors, getters, setters, and a toString method for easy representation.
 */
public class Course {
    private int courseId;
    private String courseName;
    private String courseAuther;

    // Default constructor
    public Course() {

    }

    // Parameterized constructor
    public Course(int courseId, String courseName, String courseAuther) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAuther = courseAuther;
    }

    // Getter for courseId
    public int getCourseId() {
        return courseId;
    }

    // Setter for courseId
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter for courseAuther
    public String getCourseAuther() {
        return courseAuther;
    }

    // Setter for courseAuther
    public void setCourseAuther(String courseAuther) {
        this.courseAuther = courseAuther;
    }

    // Override toString method for easy representation
    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseAuther='" + courseAuther + '\'' +
                '}';
    }
}
