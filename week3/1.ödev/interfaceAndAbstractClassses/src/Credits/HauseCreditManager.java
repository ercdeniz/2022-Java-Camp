package Credits;

public class HauseCreditManager implements ICreditManager {
    @Override
    public void calculate(ICreditManager credit) {
        System.out.println("Hesaplandı: Konut Kredisi");
    }
}
