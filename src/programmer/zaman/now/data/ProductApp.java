package programmer.zaman.now.data;

public class ProductApp {
    /**
     * Access Modifier
     * <p>
     * Public ( 1.Y 2.Y 3.Y 4.Y )
     * Protected ( 1.Y 2.Y 3.Y 4.N )
     * Default(Non-Modifier) ( 1.Y 2.Y 3.N 4.N )
     * Private ( 1.Y 2.N 3.N 4.N )
     * <p>
     * 1. Class
     * 2. Package
     * 3. SubClass
     * 4. World
     * <p>
     * On one file .java can only contain one public class
     *
     * @param args
     */
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30_000_000);
//        product.name = "Fujitsu";
//        product.price = 50_000_000;

        System.out.println(product);

        Product product2 = new Product("Mac Book Pro", 30_000_000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
