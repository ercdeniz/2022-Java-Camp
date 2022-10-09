package Credits;

public class FarmingCreditManager implements ICreditManager {
    @Override
    public void calculate(ICreditManager credit) {
        System.out.println("Hesaplandı: Tarım Kredisi");
    }
}
