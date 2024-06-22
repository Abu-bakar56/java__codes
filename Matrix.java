import java.util.Scanner;

class Mymatrix {
    int rows;
    int columns;
    int [] [] matrix;
    Scanner ac = new Scanner(System.in);
    Mymatrix() {
        System.out.println("Enter the Size of Row in Matrix");
        rows = ac.nextInt();
        System.out.println("Enter the Size of Column in Matrix");
        columns = ac.nextInt();
        matrix = new int[rows][columns];
    }
    void Input_In() {
        System.out.println("Enter Values in matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = ac.nextInt();
            }
        }
    }
    void displayMatrix(){
        System.out.println("Matrix in tabular format");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
     void sort_Row_Wise() {
        int temp;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 1; j++) {
                for (int k = 0; k < columns - j - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                         temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Matrix sorted row-wise:");
        displayMatrix();
    }
     void sort_Column_Wise() {
        int temp;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows - 1; i++) {
                for (int k = 0; k < rows - i - 1; k++) {
                    if (matrix[k][j] > matrix[k + 1][j]) {
                         temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
            }
        }
        System.out.println("Matrix sorted column-wise:");
        displayMatrix();
    }
     void Display_Sum_Rows() {
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }

  void Display_Sum_Columns() {
        System.out.println("Sum of each column:");
        for (int j = 0; j < columns; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }

 void Display_Sum_Matrix() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum of all elements in the matrix: " + sum);
    }
    void find_Largest_no_Rows() {
        System.out.println("Largest element in each row:");
        for (int i = 0; i < rows; i++) {
            int max = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + ": " + max);
        }
    }
        void find_Largest_no_Columns() {
        System.out.println("Largest element in each column:");
        for (int j = 0; j < columns; j++) {
            int max = 0;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Column " + (j + 1) + ": " + max);
        }
    }

    void find_Largest_no() {
        int max = 0;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element in the entire matrix: " + max);
    }
    void menu() {
        String choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("a. Input values into the matrix");
            System.out.println("b. Display the matrix in tabular format");
            System.out.println("c. Sort the matrix row-wise");
            System.out.println("d. Sort the matrix column-wise");
            System.out.println("e. Display the sum of each row");
            System.out.println("f. Display the sum of each column");
            System.out.println("g. Display the sum of all elements in the matrix");
            System.out.println("h. Find the largest element in each row");
            System.out.println("i. Find the largest element in each column");
            System.out.println("j. Find the largest element in the entire matrix");
            System.out.println("k. Exit");
            System.out.print("Enter your choice: ");
            choice =ac.next();
            switch (choice) {
                case "a":
                    Input_In();
                    break;
                case "b":
                    displayMatrix();
                    break;
                case "c":
                    sort_Row_Wise();
                    break;
                case "d":
                    sort_Column_Wise();
                    break;
                case "e":
                    Display_Sum_Rows();
                    break;
                case "f":
                   Display_Sum_Columns();
                    break;
                case "g":
                    Display_Sum_Matrix();
                    break;
                case "h":
                    find_Largest_no_Rows();
                    break;
                case "i":
                    find_Largest_no_Columns();
                    break;
                case "j":
                   find_Largest_no();
                    break;
                case "k":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equalsIgnoreCase("k"));
      }
    }
public class Matrix {
    public static void main(String[] args) {
    Mymatrix myMatrix = new Mymatrix();
    myMatrix.menu();
    }
}










