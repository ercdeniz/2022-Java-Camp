package kodlamaioLayeredApp.dataAccess.Category;

import kodlamaioLayeredApp.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements ICategoryDao {
    private List<Category> categories = new ArrayList<>();

    public List<Category> getCategoryList() {
        return this.categories;
    }

    @Override
    public void add(Category category) {
        this.categories.add(category);// BURAYI SOR
        System.out.println("Kategori: " + category.getName());
        System.out.println("Eklendi: JDBC: ");
    }

    @Override
    public void remove(Category category) {
        this.categories.remove(category);
        System.out.println("Kategori: " + category.getName());
        System.out.println("Silindi: JDBC");

    }
}
