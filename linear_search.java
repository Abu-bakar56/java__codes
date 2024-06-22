import java.util.Scanner;

public class linear_search {
    static Scanner scanner = new Scanner(System.in);

    static void linearSearch(int[] array) {
        int key;
        System.out.println("Enter the key to find: ");
        key = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                System.out.println("Number is found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number is not found in the array.");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        linearSearch(array);
    }
}
