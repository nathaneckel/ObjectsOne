package object1;

import java.util.logging.Logger;

public class Main {
    Person person1 = new Person("John", 30);
    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    }
}

