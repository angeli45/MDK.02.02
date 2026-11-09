package task3;

import java.util.ArrayList;

// Ограничьте класс ContactBook так, чтобы он могу хранить в себе только список контактов
public class ContactBook<T extends Contact> {
    private final ArrayList<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                contactPresented = true;
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
            }
        }if (!contactPresented) System.out.println("Не найден контакт с указанным именем.");
        }
    }