import java.util.Scanner;

public class RetailStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total_Retail_Value = 0; // Variable to store the total retail value of all products sold
        int product_no; // Variable to store the product number
        int quantity_Sold; // Variable to store the quantity sold
        double retail_Price; // Variable to store the retail price of a product
        double product_Total; // Variable to store the total price of a product (quantity sold * retail price)

        System.out.println("Enter product number and quantity sold  : enter  0 to stop");

        // Loop to continuously input product number and quantity sold until the user enters 0
        while (true) {
            System.out.print("Product number: ");
            product_no = scanner.nextInt();

            if (product_no == 0) {
                break; // Exit loop if the user enters 0
            }

            System.out.print("Quantity sold: ");
            quantity_Sold = scanner.nextInt();

            // Determine retail price based on product number using switch-case
            switch (product_no) {
                case 1:
                    retail_Price = 2.98;
                    break;
                case 2:
                    retail_Price = 4.50;
                    break;
                case 3:
                    retail_Price = 9.98;
                    break;
                case 4:
                    retail_Price = 4.49;
                    break;
                case 5:
                    retail_Price = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    continue; // Skip to next iteration of the loop if the product number is invalid
            }

            // Calculate total price of the product
            product_Total = retail_Price * quantity_Sold;
            // Update the total retail value by adding the product's total price
            total_Retail_Value += product_Total;
        }

        // Output the total retail value of all products sold
        System.out.printf("Total retail value of all products sold: %.2f", total_Retail_Value);
    }
}
