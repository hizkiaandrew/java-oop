/**
 * To Access Parent Method that's been overridden you can use keyword super
 * <p>
 * Super keyword can be used to access method, field, and constructor
 */
class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}
