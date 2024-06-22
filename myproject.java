import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    int roll;
    int sem;
    String dep;
    LinkedList<Student> studentLinkedList = new LinkedList<>();
    Scanner ab = new Scanner(System.in);

    void information() {
        System.out.println("Enter your name: ");
        name = ab.next();
        System.out.println("Enter your Roll number: ");
        roll = ab.nextInt();
        System.out.println("Enter your department: ");
        dep = ab.next();
        System.out.println("Enter your semester: ");
        sem = ab.nextInt();
        studentLinkedList.add(this);
    }
}

class Book {
    String book_name;
    int book_id;
    String book_author;
    String issued_to;
    Date issued_on;
    LinkedList<Book> bookLinkedList = new LinkedList<>();
    Scanner ac = new Scanner(System.in);
    Student s = new Student();

    public void add_book() {
        System.out.println("Enter book Name: ");
        book_name = ac.next();
        System.out.println("Enter book Id: ");
        book_id = ac.nextInt();
        System.out.println("Enter book Author Name: ");
        book_author = ac.next();
        bookLinkedList.add(this);
    }

    public void return_book() {
        add_book();
    }

    public void issue_book() {
        System.out.println("Enter book id which you want: ");
        int id2 = ac.nextInt();
        for (Book book : bookLinkedList) {
            if (id2 == book.book_id) {
                System.out.println("Yes! This book is available.");
                System.out.println("Now you want to issue it.");
                s.information();
                break;
            } else
                System.out.println("This book is not available ");
        }
        System.out.println("Enter name to which the book is issued: ");
        issued_to = ac.next();
        System.out.println("Enter Date on which the book is issued: ");
        issued_on = new Date();
        bookLinkedList.add(this);
    }

    public void delete_book() {
        int ida;
        System.out.println("Enter book id which you want to delete: ");
        ida = ac.nextInt();
        for (Book book : bookLinkedList) {
            if (ida == book.book_id) {
                bookLinkedList.remove(book);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("This book is not present.");
    }

    public void show_book() {
        System.out.println("List of Books:");
        for (Book book : bookLinkedList) {
            System.out.println("Book Name: " + book.book_name);
            System.out.println("Book ID: " + book.book_id);
            System.out.println("Book Author: " + book.book_author);
            System.out.println();
        }
    }
}

class library {
    Book book = new Book();

    void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("========================================================================");
            System.out.println("======================= WELCOME TO LIBRARY =============================");
            System.out.println("========================================================================");
            System.out.println("1. Add Book");
            System.out.println("2. Return Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Show Books");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    book.add_book();
                    break;
                case 2:
                    book.return_book();
                    break;
                case 3:
                    book.issue_book();
                    break;
                case 4:
                    book.delete_book();
                    break;
                case 5:
                    book.show_book();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

public class myproject {
    public static void main(String[] args) {
      library l = new library();
      l.menu();
    }
}
