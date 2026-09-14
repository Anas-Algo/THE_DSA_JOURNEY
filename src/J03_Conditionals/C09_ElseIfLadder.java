package J03_Conditionals;

import java.util.Scanner;

public class C09_ElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by both");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else if (num % 3 == 0){
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not Divisible.");
        }
    }
}
