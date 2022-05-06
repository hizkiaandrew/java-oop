public class ManagerApp {
    public static void main(String[] args) {
        /**
         * Inheritance
         * Make class parent and their child class.
         * Child class can access all attribute & method on parent class
         *
         * One Child only have one parent, while one parent can have many child
         */
        var manager = new Manager();
        manager.name = "Hizkia";
        manager.sayHello("Kincup");

        var vp = new VicePresident();
        vp.name = "Bokir";
        vp.sayHello("Kecap");
    }
}
