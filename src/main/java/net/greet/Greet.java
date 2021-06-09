package net.greet;
import java.util.Scanner;
import java.util.HashMap;

class Greet {
//    private static Object GreetMethods;
    public static void main(String[] args) {

        GreetMethods greetMethods = new GreetMethods();
        Scanner myObj = new Scanner(System.in);
        Boolean exit = true;
        while (exit) {
            System.out.println("Hi, you may greet a person using the keyword 'greet' followed by the persons name and enter any of the following languages: Afrikaans, English and Xhosa... ");
            String name = myObj.nextLine();
            String[] typedName = name.split(" ");
            String command = "";
            String usrName = "";
            String language = "";
            if (typedName.length == 1) {
                try {
                    command = typedName[0];
                    System.out.println("Hi, " + command);
                }catch (Exception e){
                    command = typedName[0];
                }
                command = typedName[0];
            } else if (typedName.length == 2) {
                try {
                    usrName = typedName[1];
                    System.out.println("Hi, " + usrName);
                }catch (Exception e){
                    command = typedName[0];
                    usrName = typedName[1];
                }
            } else if (typedName.length == 3) {
                command = typedName[0];
                usrName = typedName[1];
                language = typedName[2];
            }
            if (command.equals("greet")) {
                greetMethods.greetUser(usrName, language);
            } else if (command.equals("greeted")) {
                System.out.println(greetMethods.greetedUsers());
            }else if (command.equals("greetedName")) {
                System.out.println(greetMethods.greetedUserName(name));
            }
            else if (command.equals("counter")) {
                System.out.println(greetMethods.counter());
            }else if (command.equals("help")) {
                System.out.println("The commands below can be used on this application :");
                System.out.println("greet");
                System.out.println("greeted");
                System.out.println("greetedName");
                System.out.println("counter");
                System.out.println("clear");
                System.out.println("exit");
            }
            else if (command.equals("exit")) {
                exit = false;
                System.out.println("GoodBye");
            }
        }
    }
}