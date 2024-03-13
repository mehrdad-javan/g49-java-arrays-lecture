package se.lexicon;


public class ContactData {

    private static String[] contactStorage = {"Simon,123456789", "Mehrdad,987654321", "Marcus,543216789"};

    public static String findContact(String contactToFind) {
        for (String element : contactStorage) {
            if (contactToFind.equalsIgnoreCase(element)) {
                return element;
            }
        }
        return null;
    }

    public static String findContactByNumber(String contactNumberToFind) {

        for (String element : contactStorage) {
            String[] parts = element.split(","); // [0] = "Simon" [1] = "123456789"
            if (contactNumberToFind.equalsIgnoreCase(parts[1])) {
                return parts[0];
            }
        }
        return null;
    }


}
