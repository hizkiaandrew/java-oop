/**
 * Make a Class Name must be same as file name
 */
class Person {
    /**
     * Make fields
     */
    String name;
    String address;
    int age;
    final String country = "Indonesia";

    /**
     * Make a constructor to make object with this class
     * Constructor name must be same as Class name
     */
    Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    /**
     * Constructor Overloading
     * Make another constructor but with different parameter
     * With this you can make an object by different ways to create
     *
     * You also can make the constructor to call another constructor with keyword this()
     */
    Person(String name){
        this(name, null, 0);
    }

    Person(){
        this(null);
    }

    /**
     * Make Method in an object
     * @param name
     */
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }

    void sayAge(String name){
        System.out.println("Hello " + name + ", My age is " + this.age);
    }

}
