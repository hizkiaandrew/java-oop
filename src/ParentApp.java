public class ParentApp {
    public static void main(String[] args) {
        /**
         * Variable Hiding
         * On Java there is Method Overriding but there is no Attribute/field overriding.
         * So it's called Variable Hiding.
         *
         * So when you cast the child object to parent, the method run will be the overridden one
         * But the attribute is null (Based on parent attribute was null before)
         *
         * So you should not make child attribute name same as parent attribute name as it will cause Variable Hiding.
         */
        Child child = new Child();
        child.name = "Hizkia";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);

    }
}
