package Q2;
import java.util.Scanner;
/***********************************************************************************************
 Nadeen Shilbayeh
 251213277
 January 30, 2022
 Prompts user for a number and determines the ones and tens digits to use for an RMS calculation
 **********************************************************************************************/
public class MathBugs {
    public static void main(String[] args){//main method
        //declares an integer variable and initializes it with a placeholder
        int num = 0;

        //defines a scanner object called input
        Scanner input = new Scanner (System.in);

        //asks for user input
        System.out.println("Enter a number between 11 and 99: ");
        num = input.nextInt(); //reads an integer value from the standard input

        //declare and initialize integer variables for the ones and tens digit of their input
        int onesDigit = num%10; //modulus provides the ones digit
        int tensDigit = num/10; //integer division excludes the remainder and so it provides the tens digit

        //calculates the RMS of their numbers and stores it in a double variable
        double rootMeanSquare = Math.sqrt((Math.pow(onesDigit,2) + Math.pow(tensDigit,2))/2.0);

        //outputs the RMS to two decimal points
        System.out.printf("The root mean square is %.2f" , rootMeanSquare);
    }
}

