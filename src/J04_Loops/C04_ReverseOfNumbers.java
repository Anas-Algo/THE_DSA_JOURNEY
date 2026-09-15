package J04_Loops;

import java.util.Scanner;

public class C04_ReverseOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to reverse: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
}
