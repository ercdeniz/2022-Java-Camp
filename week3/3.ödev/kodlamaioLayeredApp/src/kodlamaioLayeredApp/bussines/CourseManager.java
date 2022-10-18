package kodlamaioLayeredApp.bussines;

import kodlamaioLayeredApp.core.logging.ILogger;
import kodlamaioLayeredApp.dataAccess.Course.ICourseDao;
import kodlamaioLayeredApp.entities.Course;

import java.util.List;

public class CourseManager {
    private ICourseDao courseDao;
    private List<ILogger> loggers;
    private List<Course> courses;

    public CourseManager(ICourseDao courseDao, List<ILogger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courseDao.getCourseList();
    }

    public void add(Course course) throws Exception {

        for (Course c : courses) {
            if (course.getName().equalsIgnoreCase(c.getName())) {
                throw new Exception("KURS ISMI TEKRAR EDEMEZ");
            }
        }
        courseDao.add(course);
        course.writer(course);
        for (ILogger logger : loggers) {
            logger.log(course.getName());
        }
    }

    public void remove(Course course) {
        courseDao.remove(course);
        for (ILogger logger : loggers) {
            logger.log(course.getName());
        }
    }
}
