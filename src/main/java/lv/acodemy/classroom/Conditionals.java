package lv.acodemy.classroom;

public class Conditionals {
    public static void main(String[] args) {
        //Operator: IF
        //boolean: true/false
        //5>2 (True)
        //10<1 (false)

        if (1 < 2) {
            System.out.println("Hello World");
            if (10 < 1) {
                System.out.println("Hello World");
            }
        }

        //boolean
        boolean isNikitaToxic = false;
        if (isNikitaToxic) {
            System.out.println("Spank him!");
        }

        //String example
        String myCity = "Riga";
        if (myCity.equals("Riga")) {
            System.out.println("Yes, city is Riga!");
            //call methods
            //create variables
            //create new objects
        }
        if (myCity.contains("Rig")) {
            System.out.println("Yes, city is Riga!");
        }
        String name = "John";
        if (!name.equals("Nikita")) {
            System.out.println(name + "is not Nikita, so it can be registered!");
        }
        // if-else
        int age = 20;
        if (age < 18) {
            System.out.println("Please come later!");
        } else {
            System.out.println("You can buy everything you want!" + age);

            //<= less or equals
            //=> more or equals

            //if-else-if-else

            //currentTime<= 11&& currentTime > 6-> good morning!
            //currentTime > 11 & CurrentTime <17 -> good day!
            //currentTime . 17&& current <24 ->good evening!
            //else -> good night
            //&& means AND

            int currentTime = 20;
            if (currentTime <= 11 && currentTime > 6) {
                System.out.println("good Morning!");
            } else if (currentTime > 11 && currentTime < 17) {
                System.out.println("good day!");
            } else if (currentTime > 17 && currentTime < 24) {
                System.out.println("Good evening!");
            } else if (currentTime >= 0 && currentTime < 6) {
                System.out.println("Good night!");
            } else
                System.out.println("currentTime is not correct!" + currentTime);

        }
    }
}
