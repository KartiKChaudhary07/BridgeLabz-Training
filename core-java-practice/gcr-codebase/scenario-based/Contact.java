import java.util.*;

// Custom Exception
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}

// Contact class
class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

// Manager
class ContactOrganizer {
    List<Contact> contacts = new ArrayList<>();

    void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}"))
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");

        for (Contact c : contacts)
            if (c.phone.equals(phone)) {
                System.out.println("Duplicate contact not allowed");
                return;
            }

        contacts.add(new Contact(name, phone));
        System.out.println("Contact added");
    }

    void searchContact(String phone) {
        for (Contact c : contacts)
            if (c.phone.equals(phone)) {
                System.out.println("Found: " + c.name + " - " + c.phone);
                return;
            }
        System.out.println("Contact not found");
    }

    void deleteContact(String phone) {
        contacts.removeIf(c -> c.phone.equals(phone));
        System.out.println("Contact deleted if existed");
    }

    public static void main(String[] args) throws Exception {
        ContactOrganizer cm = new ContactOrganizer();
        cm.addContact("Aman", "9876543210");
        cm.searchContact("9876543210");
        cm.deleteContact("9876543210");
    }
}
