public class Main {

    public static void main(String[] args) {
	    ProductManager productManager=new ProductManager();
	    Product product=new Product();
	    product.name="Leptop";
	    product.price=2000;
	    productManager.add(product);

	    DatabaseHelper.crud.update();
	    DatabaseHelper.connection.createConnection();
    }
}
