import java.util.Scanner;

public class cal_cgpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_Subjects;

        double totalCredits = 0.0;
        double totalGradePoints = 0.0;


        System.out.print("Enter the number of subjects: ");
         number_Subjects = scanner.nextInt();



        for (int i = 1; i <= number_Subjects; i++) {
            System.out.println("Subject " + i + ":");
            System.out.print("Enter grade (A, B, C, D, F): ");
            String grade = scanner.next();


            double gradePoint;
            switch (grade.toUpperCase()) {
                case "A":
                    gradePoint = 4.0;
                    break;
                case "B":
                    gradePoint = 3.0;
                    break;
                case "C":
                    gradePoint = 2.0;
                    break;
                case "D":
                    gradePoint = 1.0;
                    break;
                case "F":
                    gradePoint = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade entered. Using default grade point of 0.0");
                    gradePoint = 0.0;
                    break;
            }

            System.out.print("Enter credit hours for this subject: ");
            double credits = scanner.nextDouble();


            totalGradePoints += gradePoint * credits;
            totalCredits += credits;
        }


        double cgpa = totalGradePoints / totalCredits;

        System.out.println("CGPA: " + cgpa);


    }
}
