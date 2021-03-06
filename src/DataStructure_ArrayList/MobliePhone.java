package DataStructure_ArrayList;

import java.util.ArrayList;

/**
 * Created by LynnTeng on 2019/4/15.
 */
public class MobliePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobliePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {

        return this.myContact.indexOf(contact);
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContact.get(position);
        }
        return null;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List:\n");
        for (int i = 0; i < myContact.size(); i++) {
            System.out.println((i + 1) + "." + this.myContact.get(i).getName() + " -> "
                                             + this.myContact.get(i).getPhoneNumber());
        }
    }
}
