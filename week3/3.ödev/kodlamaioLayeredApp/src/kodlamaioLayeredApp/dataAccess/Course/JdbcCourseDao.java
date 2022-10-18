package kodlamaioLayeredApp.dataAccess.Course;

import kodlamaioLayeredApp.entities.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JdbcCourseDao implements ICourseDao {
    private List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> getCourseList() {
        return this.courses;
    }

    @Override
    public Optional<Course> getByName(String name) {

        return courses.stream().filter(item-> item.getName()==name).findFirst();
    }

    @Override
    public void add(Course course) {
        this.courses.add(course);
        System.out.println("Kurs: "+course);
        System.out.println("Eklendi: JDBC");
    }

    @Override
    public void remove(Course course) {
        this.courses.remove(courses);
        System.out.println("Kurs: "+course);
        System.out.println("Silindi: JDBC");
    }
}
