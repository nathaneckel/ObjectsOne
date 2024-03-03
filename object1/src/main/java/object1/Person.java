//Defining a Class
class Person {
    String name;
    int age = 0;
    // height is in centimeters
    int height = 0;
}
//constructor
public Person(String name, int age){
    this.name = name;
    this.age = age;
    this.height = height;
}

public static void main(String[] args) {
    Person person1 = new Person("John", 30);
}
