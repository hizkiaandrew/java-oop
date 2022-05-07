package programmer.zaman.now.data;

/**
 * Abstract Method
 * <p>
 * When you want all descendant to make some method you can use abstract method. That means the method will be overridden by its child.
 * When you want to make an abstract method you cannot insert block code on your abstract class
 * </p>
 * You cannot use access modifier 'private'
 */
public abstract class Animal {
    public String name;

    public abstract void run();
}
