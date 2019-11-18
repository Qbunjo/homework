package pl.homework.meeting03.e01;

import java.util.Scanner;

/**
 * Main class for exercise 3.1: Announcements.
 */
public class Main {

    public static void main(String[] args) {
        String userInput;
        Scanner scan = new Scanner(System.in);

        while (true) {
            userInput = printMainMenu(scan);
            if (userInput.equals("1")) {
                break;
            } else if (userInput.equals("2")) {
                userInput = printAddAnnouncementMenu(scan);
                switch (userInput) {
                    case "a":
                        System.out.println("Adding apartment announcement");
                        break;
                    case "b":
                        System.out.println("Adding car announcement");
                        break;
                    case "q":
                        break;
                    default:
                        System.out.println("Unrecognized input: " + userInput);
                        break;
                }
            } else {
                System.out.println("Unrecognized input: " + userInput);
            }
        }

        scan.close();
    }

    private static String printMainMenu(Scanner scan) {
        System.out.println("Please choose your option:");
        System.out.println("1) Exit");
        System.out.println("2) Add an announcement");
        return scan.nextLine();
    }

    private static String printAddAnnouncementMenu(Scanner scan) {
        System.out.println("What type of announcement do you want to add:");
        System.out.println("a) About an apartment");
        System.out.println("b) About a car");
        System.out.println("q) Quit");
        return scan.nextLine();
    }

}
