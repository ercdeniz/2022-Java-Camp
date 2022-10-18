package kodlamaioLayeredApp.bussines;

import kodlamaioLayeredApp.core.logging.ILogger;
import kodlamaioLayeredApp.dataAccess.Category.ICategoryDao;
import kodlamaioLayeredApp.entities.Category;

import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private List<ILogger> loggers;
    private List<Category> categories;

    public CategoryManager(ICategoryDao categoryDao, List<ILogger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categoryDao.getCategoryList();
    }

    public void add(Category category) throws Exception {
        for (Category c : categories) {
            if (category.getName().equalsIgnoreCase(c.getName())) {
                throw new Exception("KATEGORI ISMI TEKRAR EDEMEZ");
            }
        }
        categoryDao.add(category);
        for (ILogger logger : loggers) {
            logger.log(category.getName());
        }
    }

    public void remove(Category category) {
        categoryDao.remove(category);
        for (ILogger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
