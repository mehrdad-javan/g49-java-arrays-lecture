package se.lexicon;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a contact number:");
            String contact = scanner.next();
            String foundContact = ContactData.findContactByNumber(contact);
            if (foundContact == null) {
                System.out.println("Contact does not exist.");
            } else {
                System.out.println(foundContact);
            }
        }

    }

}
