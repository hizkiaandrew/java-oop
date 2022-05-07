class Manager extends Employee {
    /**
     * When Parent have many constructor, the child will choose parent constructor based on their parameter.
     */
    String company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is manager " + this.name);
    }
}
