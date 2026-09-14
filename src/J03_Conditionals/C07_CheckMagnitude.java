package J03_Conditionals;

import java.util.Scanner;

public class C07_CheckMagnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int magnitude = Math.abs(num);

        if (magnitude > 69){
            System.out.println("Magnitude is greater than 69.");
        } else if (magnitude < 69){
            System.out.println("Magnitude is smaller than 69.");
        } else {
            System.out.println("Magnitude is exactly 69");
        }
    }
}
