package kodlamaioLayeredApp.dataAccess.Instructor;

import kodlamaioLayeredApp.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateInstructorDao implements IInstructorDao {
    private List<Instructor> instructors = new ArrayList<>();

    public List<Instructor> getInstructorList() {
        return this.instructors;
    }

    @Override
    public void add(Instructor instructor) {
        this.instructors.add(instructor);
        System.out.println("Eğitmen: " + instructor.getName());
        System.out.println("Eklendi: Hibernate");
    }

    @Override
    public void remove(Instructor instructor) {
        this.instructors.remove(instructor);
        System.out.println("Eğitmen: " + instructor.getName());
        System.out.println("Silindi: Hibernate");
    }
}
