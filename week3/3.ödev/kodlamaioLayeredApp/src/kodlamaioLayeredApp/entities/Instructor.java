package kodlamaioLayeredApp.entities;

public class Instructor {
    private String firstName;
    private String lastName;
    private String name;
    private String profession;

    public Instructor(String firstName, String lastName, String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
        this.name = firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
