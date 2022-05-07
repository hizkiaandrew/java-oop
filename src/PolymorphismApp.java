class PolymorphismApp {
    /**
     * Polymorphism : Ability to change object to another object
     * <p>
     * Polymorphism is related to Inheritance
     * <p>
     * You can change parent class to child class and access their overridden method.
     * But the parent class have to have the original method too.
     * <p>
     * You can also access polymorphism by change argument to their child type
     *
     * @param args
     */
    public static void main(String[] args) {
        Employee employee = new Employee("Hizkia");
        employee.sayHello("Budi");

        employee = new Manager("Andrew");
        employee.sayHello("Eko");

        employee = new VicePresident("Wijaya");
        employee.sayHello("Budi");

//       Polymorphism by change type to child parent
        sayHello(new Employee("Eko"));
        sayHello(new Manager("Budi"));
        sayHello(new VicePresident("Hasan"));
    }

    /**
     * Type Check and Cast on Data Type not Primitive
     * <p>
     * You can use 'instanceof' to check data type
     * return value from instanceof is true or false
     * <p>
     * You can cast the data type as usual 'DataType newVar = (DataType) variableName'
     *
     * @param employee
     */
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello vp" + vp.name);
        } else if (employee instanceof Manager) {
            Manager mg = (Manager) employee;
            System.out.println("Hello mg" + mg.name);
        } else {
            System.out.println("Hello emp" + employee.name);
        }
    }
}
