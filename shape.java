public class shape {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int a = 0; a < 10; a++) {

            // Printing '*' characters for the first half of the row
            for (int f = 0; f < a; f++) {
                System.out.print("*");
            }

            // Printing spaces for the second half of the row
            for (int k = 10; k > a; k--) {
                System.out.print("  ");
            }

            // Printing '*' characters for the second half of the row
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }

            // Moving to the next line after completing the row
            System.out.println();
        }
    }
}
