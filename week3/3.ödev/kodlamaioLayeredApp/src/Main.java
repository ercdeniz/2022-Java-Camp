import kodlamaioLayeredApp.bussines.CourseManager;
import kodlamaioLayeredApp.bussines.InstructorManager;
import kodlamaioLayeredApp.core.logging.DatabaseLogger;
import kodlamaioLayeredApp.core.logging.FileLogger;
import kodlamaioLayeredApp.core.logging.ILogger;
import kodlamaioLayeredApp.core.logging.MailLogger;
import kodlamaioLayeredApp.dataAccess.Course.HibernateCourseDao;
import kodlamaioLayeredApp.dataAccess.Course.JdbcCourseDao;
import kodlamaioLayeredApp.dataAccess.Instructor.HibernateInstructorDao;
import kodlamaioLayeredApp.entities.Category;
import kodlamaioLayeredApp.entities.Course;
import kodlamaioLayeredApp.entities.Instructor;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        /*Kurduğum algoritmada gerekli olmasada
        sistemin birkaç farklı senaryoya karşı
        hazır olmasını hedefleyerek kullanmayacağım
        fakat gerekli olduğunu düşündüğüm classlar ve interfaceler oluşturdum*/

        Instructor instructor1 = new Instructor("Engin","Demirog","All About Codding :)");
        Category category1 = new Category("Kodlama");
        Course course1 = new Course("Java",149.99 ,instructor1,category1);

        List<ILogger> loggers= List.of(
                new DatabaseLogger(),
                new FileLogger(),
                new MailLogger()
        );
        CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course1);
    }
}
