package J04_Loops;

import java.util.Scanner;

public class C12_CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("Number of digit: 1");
            return;
        }

        num = Math.abs(num);

        int count = 0;

        while(num != 0){
            num = num/10;
            count++;
        }
        System.out.println("Number of digits: "+count);
    }
}
