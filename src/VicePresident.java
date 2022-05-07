class VicePresident extends Manager {

    /**
     * When Parent has constructor, the child have to initialize their parent constructor on their constructor with 'super' keyword.
     *
     * @param name
     */
    VicePresident(String name) {
        super(name);
    }

    /**
     * Method overriding
     * Method from parent is being made again with different body
     * This affect object created from this class cannot access parent method that's been overridden
     */
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is vice president " + this.name);
    }

}
