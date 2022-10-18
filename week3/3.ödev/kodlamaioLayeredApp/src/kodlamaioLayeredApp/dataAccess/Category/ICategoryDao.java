package kodlamaioLayeredApp.dataAccess.Category;

import kodlamaioLayeredApp.entities.Category;

import java.util.List;

public interface ICategoryDao {
    void add(Category category);

    void remove(Category category);

    List<Category> getCategoryList();
}
