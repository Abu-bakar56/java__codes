//import javax.swing.*;
//import java.util.ArrayList;
//
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
//    ArrayList<Person> person1 = new ArrayList<>();
//
//    void add_Person(Person person) {
//        try {
//            if (person == null || person.name.isEmpty() || person.address.isEmpty() ) {
//                System.out.println("Invalid input provided. Person not added.");
//            }
//            if (person1.contains(person)) {
//                System.out.println("Person  with the same name already exists. Person not added.");
//            }
//
//            person1.add(person);
//            JOptionPane.showMessageDialog(null, "Person added successfully!");
//        } catch (IllegalArgumentException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//
//
//    void delete_Person(Person person) {
//        try {
//            if (person1.isEmpty()) {
//                System.out.println("Address Book is empty");
//            }
//            person1.remove(person);
//            JOptionPane.showMessageDialog(null, "Person deleted successfully!");
//        } catch (IllegalStateException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//    Person search_Person(String name) {
//        if (person1.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Address Book is empty");
//            return null;
//        }
//        for (Person person : person1) {
//            if (person.name.equalsIgnoreCase(name)) {
//                return person;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "No Person found with name " + name);
//        return null;
//    }
//}
//
//public class mainMenu {
//    public static void main(String[] args) {
//         AddressBook addressBook = new AddressBook();
//        while (true) {
//            String choice = JOptionPane.showInputDialog(null, "Select an option:\n1. Add Person\n2. Delete Person\n3. Search Person\n4. Exit");
//
//            switch (choice) {
//                case "1":
//                {
//                    String name = JOptionPane.showInputDialog("Enter Name:");
//                    String address = JOptionPane.showInputDialog("Enter Address:");
//                    String phoneNo = JOptionPane.showInputDialog("Enter Phone Number:");
//
//                    Person person = new Person(name, address, phoneNo);
//                    addressBook.add_Person(person);
//                }
//                    break;
//                case "2":
//                {
//                    String name = JOptionPane.showInputDialog("Enter Name to delete:");
//                    Person person = addressBook.search_Person(name);
//                    if (person != null) {
//                        addressBook.delete_Person(person);
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Person not found!");
//                    }
//                }
//                    break;
//                case "3":
//                {
//                    String name = JOptionPane.showInputDialog("Enter Name to search:");
//                    Person person = addressBook.search_Person(name);
//                    if (person != null) {
//                        JOptionPane.showMessageDialog(null, "Person found!\nName: " + person.name + "\nAddress: "
//                                + person.address + "\nPhone Number: " + person.phoneNo);
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Person not found!");
//                    }
//                }
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
