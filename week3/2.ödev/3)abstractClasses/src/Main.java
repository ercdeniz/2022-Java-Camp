public class Main {

    public static void main(String[] args) {
        GameCalculator gameCalculator1 = new ManGameCalculator();
        gameCalculator1.hesapla();
        gameCalculator1.gameOver();
        
        GameCalculator gameCalculator2 = new KidsCalculator();
        gameCalculator2.hesapla();
        gameCalculator2.gameOver();
    }
}
