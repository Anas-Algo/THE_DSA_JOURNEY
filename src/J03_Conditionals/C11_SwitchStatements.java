package J03_Conditionals;
import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Day Finder ===");
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();

        // Think of switch as a fast track directly to the matching case.
        // It replaces long, messy if-else-if chains.
        switch (day) {
            case 1:
                System.out.println("Monday-");
                break; // Stops execution. Try removing it to see 'fall-through'!

            case 2:
                System.out.println("Tuesday-");
                break;

            case 3:
                System.out.println("Wednesday-");
                break;

            case 4:
                System.out.println("Thursday-");
                break;

            case 5:
                System.out.println("Friday-");
                break;

            case 6:
                System.out.println("Saturday-");
                break;

            case 7:
                System.out.println("Sunday-");
                break;

            default: // Runs ONLY if none of the above cases match.
                System.out.println("Invalid day! Please enter a number between 1 and 7.");
                // No break needed here because it's the last statement.
        }

        sc.close();
    }
}