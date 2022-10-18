package kodlamaioLayeredApp.dataAccess.Course;

import kodlamaioLayeredApp.entities.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HibernateCourseDao implements ICourseDao {
    private List<Course> courses = new ArrayList<>();

    public List<Course> getCourseList() {
        return this.courses;
    }

    @Override
    public Optional<Course> getByName(String name) {
        return null;
    }

    @Override
    public void add(Course course) {
        this.courses.add(course);
        System.out.println("Kurs: " + course.getName());
        System.out.println("Eklendi: Hibernate: ");
    }

    @Override
    public void remove(Course course) {
        this.courses.remove(course);
        System.out.println("Kurs: "+course);
        System.out.println("Silindi: Hibernate");
    }
}
