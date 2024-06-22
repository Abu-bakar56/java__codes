//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.List;
//
//class Person {
//    String name;
//    String address;
//    String phoneNo;
//
//    Person(String name, String address, String phoneNo) {
//        this.name = name;
//        this.address = address;
//        this.phoneNo = phoneNo;
//    }
//}
//
//class AddressBook {
//    List<Person> persons = new ArrayList<>();
//
//    void addPerson(Person person) {
//        try {
//            if (person == null || person.name.isEmpty() || person.address.isEmpty() || !isNumeric(person.phoneNo)) {
//                throw new IllegalArgumentException("Invalid input provided. Person not added.");
//            }
//            if (persons.contains(person)) {
//                throw new IllegalArgumentException("Person  with the same name already exists. Person not added.");
//            }
//
//            persons.add(person);
//            JOptionPane.showMessageDialog(null, "Person added successfully!");
//        } catch (IllegalArgumentException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//    private boolean isNumeric(String phoneNo) {
//        return phoneNo.matches("\\d+");
//    }
//
//    void deletePerson(Person person) {
//        try {
//            if (persons.isEmpty()) {
//                throw new IllegalStateException("Address Book is empty");
//            }
//            persons.remove(person);
//            JOptionPane.showMessageDialog(null, "Person deleted successfully!");
//        } catch (IllegalStateException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//    Person searchPerson(String name) {
//        if (persons.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Address Book is empty");
//            return null;
//        }
//        for (Person person : persons) {
//            if (person.name.equalsIgnoreCase(name)) {
//                return person;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "No Person found with name " + name);
//        return null;
//    }
//}
//
//public class Application {
//    static AddressBook addressBook = new AddressBook();
//
//    static void addPerson() {
//        String name = JOptionPane.showInputDialog("Enter Name:");
//        String address = JOptionPane.showInputDialog("Enter Address:");
//        String phoneNo = JOptionPane.showInputDialog("Enter Phone Number:");
//
//        Person person = new Person(name, address, phoneNo);
//        addressBook.addPerson(person);
//    }
//
//    static void deletePerson() {
//        String name = JOptionPane.showInputDialog("Enter Name to delete:");
//        Person person = addressBook.searchPerson(name);
//        if (person != null) {
//            addressBook.deletePerson(person);
//        } else {
//            JOptionPane.showMessageDialog(null, "Person not found!");
//        }
//    }
//
//    static void searchPerson() {
//        String name = JOptionPane.showInputDialog("Enter Name to search:");
//        Person person = addressBook.searchPerson(name);
//        if (person != null) {
//            JOptionPane.showMessageDialog(null, "Person found!\nName: " + person.name + "\nAddress: "
//                    + person.address + "\nPhone Number: " + person.phoneNo);
//        } else {
//            JOptionPane.showMessageDialog(null, "Person not found!");
//        }
//    }
//
//    public static void main(String[] args) {
//        while (true) {
//            String choice = JOptionPane.showInputDialog(null, "Select an option:\n1. Add Person\n2. Delete Person\n3. Search Person\n4. Exit");
//
//            switch (choice) {
//                case "1":
//                    addPerson();
//                    break;
//                case "2":
//                    deletePerson();
//                    break;
//                case "3":
//                    searchPerson();
//                    break;
//                case "4":
//                    System.exit(0);
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null, "Invalid option");
//            }
//        }
//    }
//}
