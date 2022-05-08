package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        /**
         * .equals method will only compare two variables based on their memory location
         */
        String first = "Hizkia";
        first = first + " " + "Andrew";

        System.out.println(first);

        String second = "Hizkia Andrew";
        System.out.println(second);

        /**
         * it became false because it was a different object because it depends on variable location on Memory so it is not the value of the String
         */
        System.out.println(first == second);
        System.out.println(first.equals(second));//it becomes true because the value is same

        String third = "Hizkia Andrew";

        /**
         * it become true because on Java there is memory optimizer feature so it wont make a new variable location on memory it will just refer the variable location that has same value
         */
        System.out.println(second == third);
        System.out.println(second.equals(third));//it becomes true because the value is same
    }
}
