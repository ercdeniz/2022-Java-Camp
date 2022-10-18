package kodlamaioLayeredApp.dataAccess.Instructor;

import kodlamaioLayeredApp.entities.Instructor;

import java.util.List;

public interface IInstructorDao {
    void add(Instructor instructor);

    void remove(Instructor instructor);

    List<Instructor> getInstructorList();
}
