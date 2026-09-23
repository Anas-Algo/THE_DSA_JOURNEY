package J05_PatternPrinting;

import java.util.Scanner;

public class C07_AlphabetSquare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Alphabet Square: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
