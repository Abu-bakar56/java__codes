import java.util.Scanner;

class Library {
    String[] aw_books = new String[100];
    String[] issue_books = new String[100];

    Scanner ac = new Scanner(System.in);

    void add_book() {
        System.out.println("Enter name of book to ADD in library");

        for (int i = 0; i < aw_books.length; i++) {
            if (aw_books[i] == null) {
                aw_books[i] = ac.next();
                break;
            }
        }
    }

    void rem_book(String book) {
        for (int i = 0; i < aw_books.length; i++) {
            if (book.equalsIgnoreCase(aw_books[i])) {
                aw_books[i] = null;
                break;
            }
        }
    }

    void issue_book() {
        System.out.println("Enter name of book which issue from library");

        for (int i = 0; i < aw_books.length; i++) {
            if (aw_books[i] != null) {
                issue_books[i] = aw_books[i];
                aw_books[i] = null;
                break;
            }
        }
    }

    void return_book() {
        System.out.println("Enter name of book to return in library");
        String book = ac.next();

        for (int i = 0; i < issue_books.length; i++) {
            if (book.equalsIgnoreCase(issue_books[i])) {
                issue_books[i] = null;
                add_book();
                break;
            }
        }
    }

    void show_all_aw() {
        System.out.println("All Available Books:");
        for (String aw_book : aw_books) {
            if (aw_book != null) {
                System.out.println(aw_book);
            }
        }
    }
}

public class library_management_system {
    public static void main(String[] args) {
        Library obj = new Library();

        Scanner a = new Scanner(System.in);
        String op;
        System.out.println("ENTER Y TO START");
        System.out.println("ENTER N TO END");
        op = a.next();
        while (op.equalsIgnoreCase("y")) {

            System.out.println("1. FOR ADD BOOK");
            System.out.println("2. FOR ISSUE BOOK");
            System.out.println("3. TO RETURN BOOK");
            System.out.println("4. TO SHOW ALL AVAILABLE BOOK");
            System.out.println("Enter your choice:");
            int option = a.nextInt();
            switch (option) {
                case 1: {
                    obj.add_book();
                    break;
                }
                case 2: {
                    obj.issue_book();
                    break;
                }
                case 3: {
                    obj.return_book();
                    break;
                }
                case 4: {
                    obj.show_all_aw();
                    break;
                }
                default:
                    System.out.println("YOU ENTERED AN INVALID NUMBER");
            }
            System.out.println("ENTER Y TO CONTINUE OR N TO END");
            op = a.next();
        }
        System.out.println("Thanks");
    }
}
