package lv.acodemy.classroom;

import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {
        Scanner chatBot = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = chatBot.next();

        System.out.println("What is your last name?");
        String lastName = chatBot.next();

        System.out.printf("Hello %s %s. My name is Bot Alex K. How can i help you?%n", name, lastName);
        // %n = new line
        // \n = new line
        //System.out.println(String.format("Hello %s %s. My name is Bot Alex K. How can i help you?", name, lastName));
        //System.out.println

        System.out.println("Press 1 for registration of press 2 to stop chat");
        byte answer =  chatBot.nextByte();
        if (answer==1) {
            System.out.println("Please enter the date in following format: (dd-MM-yyyy)");
            String registrationDate = chatBot.next();
            System.out.println("you! ve registeres on daste:"+registrationDate);
        }


    }
}
