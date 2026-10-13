import java.util.Scanner;

public class IT26101970Lab4Q1{

    public static void main(String[] args){

        // Declaring variables
        double number;

        // Creating a scanner input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter a number: ");
        number = input.nextDouble();

        // Checking whether the number is positive or negative or zero
        if (number > 0){
            System.out.println("The number is: Positive");
        } else if (number < 0) {
            System.out.println("The number is: Negative");
        } else {
            System.out.println("The number is Zero");
        }


    }
}