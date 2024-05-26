package in.four7.jpahibernate;

import in.four7.jpahibernate.cource.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * This class implements CommandLineRunner to execute code at application startup.
 * It uses CourseJdbcRepository to perform CRUD operations on Course entities.
 */
@Component
public class CourceJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Inserting multiple courses into the database
        repository.insert(new Course(1, "Learn AWS", "Rahul"));
        repository.insert(new Course(2, "Learn Python", "Rahul"));
        repository.insert(new Course(3, "Learn MySQL", "Rahul"));
        repository.insert(new Course(4, "Learn React", "Rahul"));
        repository.insert(new Course(5, "Learn MongoDB", "Rahul"));
        repository.insert(new Course(6, "Learn Java", "Rahul"));

        // Deleting the course with CourseID 3
        repository.delete(3);

        // Finding and printing the course with CourseID 2
        System.out.println(repository.findById(2));

        // Trying to find and print the course with CourseID 3 (which was deleted)
        try {
            System.out.println(repository.findById(3));
        } catch (Exception e) {
            System.out.println("Course with ID 3 not found.");
        }
    }
}
