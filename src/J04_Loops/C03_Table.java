package J04_Loops;

import java.util.Scanner;

public class C03_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to get table: ");
        int n = sc.nextInt();

        System.out.println("===Table of "+n+" ===");
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
