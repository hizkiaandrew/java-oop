package programmer.zaman.now.data;

public interface Car extends HasBrand {
    /**
     * Interface
     * <p>
     * Interface is similar to abstract class but on Interface all the method is abstract and don't have block
     * You can have field on Interface but it must be constant
     * You can use keyword 'implements' to pass down the interface
     * <p>
     * All method was public and you don't have to make these public (Default was public abstract)
     */
    void drive();

    int getTire();

    /**
     * Default Method
     * On Java 8 above you can add default method on interface
     * Because if the program becomes larger the maintenance becomes difficult because when interface make new method all class that implement must override the new method.
     * Default Method give you an option to class that implement you can override the method or not.
     */
    default boolean isBig() {
        return false;
    }

}
