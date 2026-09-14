package J03_Conditionals;

import java.util.Scanner;

public class C06_AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num to get absolute value: ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("Absolute value: "+ num);
        }
        else{
            System.out.println("Absolute value: "+ (-num));
        }
    }
}
