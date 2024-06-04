package Lesson_13;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PhoneBook {

    private HashMap<String, List<String>> phoneNumbers;

    public PhoneBook() {
        phoneNumbers = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (!phoneNumbers.containsKey(lastName)) {
            phoneNumbers.put(lastName, new ArrayList<>());
        }
        phoneNumbers.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneNumbers.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Горбачев", "89266661215");
        phoneBook.add("Сталин", "84952741001");
        phoneBook.add("Ельцин", "88005559911");
        phoneBook.add("Токмаков", "89773619317");
        phoneBook.add("Токмаков", "88000003377");

        System.out.println("Номера Горбачева: " + phoneBook.get("Горбачев"));
        System.out.println("Номера Сталина: " + phoneBook.get("Сталин"));
        System.out.println("Номера Токмакова: " + phoneBook.get("Токмаков"));
        System.out.println("Номера Ельцина: " + phoneBook.get("Ельцин"));
    }
}