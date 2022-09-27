public class Main {

    public static void main(String[] args) {
        //Product product = new Product(1, "Telefon", "Akıllı Telefon", 6500, 4);

        Product product = new Product();
        product.setId(1);
        product.setName("Telefon");
        product.setDescription("Akıllı Telefon");
        product.setPrice(6500);
        product.setStockAmount(4);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());
    }
}
