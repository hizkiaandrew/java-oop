package programmer.zaman.now.data;

public class Category {
    /**
     * Encapsulation
     * <p>
     * Make sure sensitive data in an object is secured from outside access to make an object data is constantly valid.
     * You can make the attribute to private to secure the attribute.
     * Most Java Programmer make all the attribute to private to secure the data.
     * <p>
     * <p>
     * Getter & Setter
     * You can change the data that was secured using Setter and get the data with Getter
     * Setter & Getter must be public
     */
    private String id;

    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        //You can add a validation when you want to set id
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
