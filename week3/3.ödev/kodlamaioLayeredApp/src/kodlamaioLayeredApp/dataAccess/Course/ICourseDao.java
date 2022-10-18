package kodlamaioLayeredApp.dataAccess.Course;

import kodlamaioLayeredApp.entities.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseDao {
    void add(Course course);

    void remove(Course course);

    List<Course> getCourseList();

    Optional<Course> getByName(String name);
}
