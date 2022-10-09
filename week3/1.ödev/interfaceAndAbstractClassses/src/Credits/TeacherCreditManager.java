package Credits;

public class TeacherCreditManager implements ICreditManager {
    @Override
    public void calculate(ICreditManager credit) {
        System.out.println("Hesaplandı: Öğretmen Kredisi");
    }
}
