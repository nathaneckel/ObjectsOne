package object1;

import java.util.logging.Logger;

//consulted with Jake, I'm looking at the requirements and it appears
//I have fulfilled the basics for this lab
//So this will be my first -final commit
//And I only have a couple dozen to do
// Takeaways:  I learned to better understand IntelliJ's debugger without being completely disoriented
// I'm in a WEIRD balance of using the debugger suggestions (feel like I'm blindly doing this)
// To counter the blind feeling, I am thinking about the suggestions before/after I take them / execute them
// Hopefully soon I will be able to anticipate the correct coding sooner.
// This represents a huge initial progress for me, only 6 days after this lab was assigned.
// However the happy "flow" energy actually started appearing as I worked WITH the debugger.

public class Main {
    Person person1 = new Person();
    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    }
}

