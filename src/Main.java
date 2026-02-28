import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get student details
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        // get three test scores
        System.out.println("Enter score 1: ");
        double score1 = scanner.nextDouble();

        System.out.println("Enter score 2: ");
        double score2 = scanner.nextDouble();

        System.out.println("Enter score 3: ");
        double score3 = scanner.nextDouble();

        // calculate average and assign grade
        double average = calculateAverage(score1, score2, score3);
        String grade = assignGrade(average);
        boolean passed = hasPassed(average);

        // display results
        System.out.println("Student: " + name);
        System.out.println("Average score: " + average);
        System.out.println("Grade: " + grade);

        if (passed) {
            System.out.println(name + " has PASSED");
        } else {
            System.out.println(name + " has FAILED");
        }
    }

    // adds the three scores and divides by 3
    static double calculateAverage(double s1, double s2, double s3) {
        return (s1 + s2 + s3) / 3;
    }

    // assigns a letter grade based on the average
    static String assignGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    static boolean hasPassed(double average) {
        return average >= 60;
    }
}

