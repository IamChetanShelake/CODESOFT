import java.util.*;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.println("------------------------------------------");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in Subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("------------------------------------------\n");

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("\nAverage Percentage: %.2f%%\n", averagePercentage);
        System.out.println("\nGrade: " + grade);
        System.out.println("------------------------------------------");

    }
}
