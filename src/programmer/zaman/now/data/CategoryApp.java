package programmer.zaman.now.data;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("1");
        category.setId(null);// if the data was not private, the id will be null
        System.out.println("Category : " + category.getId());
    }
}
