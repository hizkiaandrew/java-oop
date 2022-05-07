class Parent {
    String name;

    void doIt() {
        System.out.println("Do It from Parent" + this.name);
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("Do It from Child" + this.name);
    }
}
