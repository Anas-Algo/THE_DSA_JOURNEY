package J06_Methods;

import java.util.Scanner;

public class C03_MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int a = sc.nextInt();

        System.out.print("Enter second num: ");
        int b = sc.nextInt();

        System.out.print("Enter third num: ");
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Maximum Number: "+max);
    }
}
