public class ShapeApp {
    public static void main(String[] args) {
        /**
         * You can access parent method that's been overridden with define method that access parent method.
         */
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
