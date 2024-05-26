package in.four7.jpahibernate;

import in.four7.jpahibernate.cource.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * This repository class handles CRUD operations for the Course entity using JdbcTemplate.
 */
@Repository
public class CourseJdbcRepository {

    // SQL query for inserting a course
    private static final String INSERT_QUERY = """
            INSERT INTO course (CourseID, CourseName, AutherName) VALUES
                (?, ?, ?)
            """;

    // SQL query for deleting a course by ID
    private static final String DELETE_QUERY = """
            DELETE FROM course 
            WHERE CourseID = ?
            """;

    // SQL query for selecting a course by ID
    private static final String SELECT_QUERY = """
            SELECT * FROM course 
            WHERE CourseID = ?
            """;

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    /**
     * Inserts a course into the database.
     *
     * @param course the course to be inserted
     */
    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getCourseId(), course.getCourseName(), course.getCourseAuther());
    }

    /**
     * Deletes a course from the database by ID.
     *
     * @param courseId the ID of the course to be deleted
     */
    public void delete(int courseId) {
        springJdbcTemplate.update(DELETE_QUERY, courseId);
    }

    /**
     * Finds a course by ID.
     *
     * @param courseId the ID of the course to find
     * @return the course with the specified ID
     */
    public Course findById(int courseId) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), courseId);
    }
}
