package object1;

// Define a class
class Person {
    private static int height = 0;
    // Define Instance Variables - different for each object (OR do I do this in TEST?)
    // NO MORE BUGS!!!  WOW!  Maybe I can do this!
    String name;
    int age = 0;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        Person.height = height;
    }

    public Person() {
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30, 200);

        /* Now you can use the Object `person1` */

    }
}