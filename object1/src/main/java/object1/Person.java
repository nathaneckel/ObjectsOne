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
//  Reading to see what to do with this arra
//    Person person1 = new Person ("Alice", 24, 100);
//    Person person2 = new Person ("Bob", 33, 222);
//    Person person3 = new Person ("Nathan", 49, 333);

    public Person() {

    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30, height);

        /* Now you can use the Object `person1` */

    }
}