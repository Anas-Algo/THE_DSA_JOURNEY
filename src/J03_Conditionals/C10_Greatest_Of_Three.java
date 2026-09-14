package J03_Conditionals;
import java.util.Scanner;

// Ques. Take three positive integers input and print the greatest of them.
public class C10_Greatest_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int a = sc.nextInt();
        System.out.print("Enter second num: ");
        int b = sc.nextInt();
        System.out.print("Enter third num: ");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println(a + " is greatest.");
        } else if (b>a && b>c) {
            System.out.println(b + " is greatest.");
        } else {
            System.out.println(c + " is greatest.");
        }
    }
}
