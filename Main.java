//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Q1. Write a program that checks the role of the user
        If the role is admin print "welcome admin"
        If the role is superuser print "welcome superuser"
        If the role is user print "welcome user" (tip: use if else) */

        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Create a Scanner object to take the user input (it will be used for all questions)
        Scanner input = new Scanner( System.in);

        // 2. Prompt the user to enter his/her role
        System.out.print("Please enter your role(admin,superuser, or user): ");
        String userRole = input.nextLine();

        // 3. Check the three conditions and prints the result
        if (userRole.equalsIgnoreCase("admin"))
            System.out.println("Welcome admin");
        else if (userRole.equalsIgnoreCase("superuser"))
            System.out.println("Welcome superuser");
        else if (userRole.equalsIgnoreCase("user"))
            System.out.println("Welcome user");
        else
            System.out.println("Please enter a correct role (admin, superuser, or user)");

        //----------------------------------------------------------------------
        // Q2.Take three numbers from the user and print the greatest number.

        // Header
        System.out.println("-------------------Q2-------------------");

        // 2. Prompt the user to enter three numbers
        System.out.print("Input the 1st number: ");
        int firstNum = input.nextInt();
        System.out.print("Input the 2st number: ");
        int secondNum = input.nextInt();
        System.out.print("Input the 3st number: ");
        int thirdNum = input.nextInt();

        // 3. Check for the greatest number and prints the result
        if(firstNum > secondNum && firstNum > thirdNum)
            System.out.println("The greatest number is " + firstNum);
        else if (secondNum > firstNum && secondNum > thirdNum)
            System.out.println("The greatest number is " + secondNum);
        else System.out.println("The greatest number is " + thirdNum);

        //----------------------------------------------------------------------
        /* Q3.Write a Java program that generates an integer
        between 1 and 7 and displays the name of the weekday.*/

        // Header
        System.out.println("-------------------Q3-------------------");

        // 2. Generate a random integer between 1 and 7
        int weekDay = (int)(Math.random() * 7) + 1;// 1-7

        // 3. Print the random integer
        System.out.println("The random generated integer is: " + weekDay);

        // 4. Check the cases and prints the result
        switch (weekDay){
            case 1:
                System.out.println("The week day is Sunday");
                break;
            case 2:
                System.out.println("The week day is Monday");
                break;
            case 3:
                System.out.println("The week day is Tuesday");
                break;
            case 4:
                System.out.println("The week day is Wednesday");
                break;
            case 5:
                System.out.println("The week day is Thursday");
                break;
            case 6:
                System.out.println("The week day is Friday");
                break;
            case 7:
                System.out.println("The week day is Saturday");
                break;
        }

        //----------------------------------------------------------------------
        /* Q4.Write a program that takes a numeric score as input and prints
        the corresponding letter grade using the following grading scale*/

        // Header
        System.out.println("-------------------Q4-------------------");

        // 2. Prompt the user to enter a numeric score
        System.out.print("Please Enter your numeric score: ");
        int userScore = input.nextInt();

        // 3. Check the grades and prints the result
        if(userScore >= 90 && userScore <= 100) System.out.println("Numeric Score: "+ userScore + "\nLetter Grade: A");
        else if (userScore >= 80 && userScore <= 89) System.out.println("Numeric Score: "+ userScore + "\nLetter Grade: B");
        else if (userScore >= 70 && userScore <= 79) System.out.println("Numeric Score: "+ userScore + "\nLetter Grade: C");
        else if (userScore >= 60 && userScore <= 69) System.out.println("Numeric Score: "+ userScore + "\nLetter Grade: D");
        else if (userScore >= 0 && userScore <= 59) System.out.println("Numeric Score: "+ userScore + "\nLetter Grade: F");
        else System.out.println("Please enter a numerical value between 0-100");

        //----------------------------------------------------------------------
        /* Q5.Write a Java program that takes a person's age as input and categorizes
        them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement.*/

        // Header
        System.out.println("-------------------Q5-------------------");

        // 2. Prompt the user to enter his/her age
        System.out.print("Please Enter your age: ");
        int userAge = input.nextInt();

        // 3. Categorize the ages and prints the result
        if(userAge < 13) System.out.println("You are a Child.");
        else if (userAge >=  13 && userAge <= 19  ) System.out.println("You are a Teenager.");
        else System.out.println("You are an Adult.");

        //----------------------------------------------------------------------
        // Closing the Scanner
        input.close();
    }
}