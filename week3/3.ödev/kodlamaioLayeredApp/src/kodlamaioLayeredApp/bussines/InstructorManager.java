package kodlamaioLayeredApp.bussines;

import kodlamaioLayeredApp.core.logging.ILogger;
import kodlamaioLayeredApp.dataAccess.Instructor.IInstructorDao;
import kodlamaioLayeredApp.entities.Course;
import kodlamaioLayeredApp.entities.Instructor;

import java.util.List;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private List<ILogger> loggers;
    private List<Instructor> instructors;

    public InstructorManager(IInstructorDao instructorDao, List<ILogger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructors = instructorDao.getInstructorList();
    }

    public void add(Instructor instructor) throws Exception {
        for (Instructor i : instructors) {
            if (instructor.getName().equalsIgnoreCase(i.getName())) {
                throw new Exception("EGITMEN ISMI TEKRAR EDEMEZ");
            }
        }
        instructorDao.add(instructor);
        for (ILogger logger : loggers) {
            logger.log(instructor.getName());
        }
    }

    public void remove(Instructor instructor) {
        instructorDao.remove(instructor);
        for (ILogger logger : loggers) {
            logger.log(instructor.getName());
        }
    }
}
