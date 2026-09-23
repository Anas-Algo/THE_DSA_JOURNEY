package J06_Methods;

import java.util.Scanner;

public class C02_MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int a = sc.nextInt();

        System.out.print("Enter second num: ");
        int b = sc.nextInt();

        int max = Math.max(a, b);
        System.out.println("Maximum Number: "+max);
    }
}
