import java.util.Scanner;

public class IT26101970Lab4Q2 {

    public static void main(String[] args) {

        // Declaring the variables
        double examMarks, labMarks, examPercentage, labPercentage, finalMarks;

        // Creating the Scanner input
        Scanner input = new Scanner(System.in);

        // Input and validate the exam marks
        System.out.print("Please enter exam mars (out of 100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        // Input and validate the lab
        System.out.println("Please enter lab submission marks (out of 100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100){
            System.out.println("Invalid input for exam marks. Terminating program");
            return;
        }


        //  Input percentage for exam marks
        System.out.println("Please enter the percentage given for the exam: ");
        examPercentage = input.nextDouble();

        // Input the percentage for lab submission marks
        System.out.println("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

        // Validate that percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        // Calculate the final exam marks
        finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Output the results
        System.out.println();
        System.out.println("Final Exam Mark is: " + finalMarks);
    }
}
