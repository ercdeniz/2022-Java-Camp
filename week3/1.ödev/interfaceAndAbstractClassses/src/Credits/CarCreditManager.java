package Credits;

public class CarCreditManager implements ICreditManager {
    @Override
    public void calculate(ICreditManager credit) {
        System.out.println("Hesaplandı: Araba Kredisi");
    }
}
