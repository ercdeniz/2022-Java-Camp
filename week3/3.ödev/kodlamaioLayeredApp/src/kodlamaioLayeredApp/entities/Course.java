package kodlamaioLayeredApp.entities;

public class Course {
    private String name;
    private double price;
    private Instructor instructor;
    private Category category;

    public Course(String name, Category category, double price, Instructor instructor) {
        this.name = name;
        this.price = price;
        this.instructor = instructor;
        this.category = category;
    }

    public void writer(Course course) {
        System.out.println("Kursun Kategorisi: " + course.getCategory().getName());
        System.out.println("Kursun Fiyatı: " + course.getPrice() + "TL");
        System.out.println("Kursun Eğitmeni: " + course.getInstructor().getName());
        System.out.println("Eğitmenin Uzmanlık Alanı: " + course.getInstructor().getProfession());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
