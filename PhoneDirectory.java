/*
 A phone directory holds a list of names with a phone number for each name. It is possible to find the number associated with a given name, and to specify the phone number for a given name. 

 [Hint:use a HashMap to store names as keys and phone numbers as values. The user can choose to find a number by providing a name or add a new name with a phone number. The program runs in a loop until the user chooses to exit.]
 */

 import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> directory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPhone Directory Menu:");
            System.out.println("1. Find number by name");
            System.out.println("2. Add new name and number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter name to find: ");
                    String findName = scanner.nextLine();
                    String phoneNumber = directory.get(findName);
                    if (phoneNumber != null) {
                        System.out.println("Phone number of " + findName + " is: " + phoneNumber);
                    } else {
                        System.out.println(findName + " not found in the directory.");
                    }
                    break;

                case "2":
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter phone number for " + newName + ": ");
                    String newNumber = scanner.nextLine();
                    directory.put(newName, newNumber);
                    System.out.println("Entry added successfully.");
                    break;

                case "3":
                    System.out.println("Exiting phone directory. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}

/*Phone Directory Menu:
1. Find number by name
2. Add new name and number
3. Exit
Enter your choice (1-3):  */