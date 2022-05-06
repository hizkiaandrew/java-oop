public class PersonApp {
    public static void main(String[] args) {
        /**
         * Make an Object
         */
        var person1 = new Person("Budi", "Yogyakarta", 22);
        Person person2 = new Person("Bokir", "Tanggerang", 25);

        Person person3 = new Person("Kincup", "Semarang", 23);

        /**
         * Manipulate Object field & Access field
         */
        person1.name = "Hizkia";
        person1.address = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        /**
         * Access method on object
         */
        person1.sayHello("Bokir");
        person1.sayAge("Bokir");//if attribute called was empty then it will return default value



    }
}
