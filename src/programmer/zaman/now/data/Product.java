package programmer.zaman.now.data;

public class Product {
    /**
     * Make Package
     */
    public String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * To String usually used to represent the object into a String.
     * Because if you print the object, the value will be 'className' + @ + hashCode
     * So you can override the method toString to make the object easier to read.
     *
     * @return
     */
    public String toString() {
        return "Product name " + this.name + ", price : " + this.price;
    }

/**
 * Override equals manual mode
 */
//    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        }
//
//        if (!(o instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) o;
//        if(this.price != product.price){
//            return false;
//        }
//
//        if(this.name != null){
//            return this.name.equals(product.name);
//        }else{
//            return product.name == null;
//        }
//    }

    /**
     * Generated from IDE
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    /**
     * HashCode
     * HashCode Method : represent on object to integer value (if want to represent in String you can use toString)
     * HashCode used to make unique data structure like HashMap, Set, etc
     * on Default, hashCode will return integer value based on memory data, but you can override it
     * <p>
     * Hash code value must be same if the two object is equal
     * if two object is not equal the hashcode don't have be same
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
