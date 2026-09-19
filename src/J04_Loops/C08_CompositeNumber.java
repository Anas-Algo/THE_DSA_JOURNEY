package J04_Loops;

import java.util.Scanner;

public class C08_CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num to check if it is composite or not: ");
        int num = sc.nextInt();

        boolean isComposite = false;

        if ( num > 1){
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    isComposite = true;
                    break;
                }
            }
        }
        if (isComposite){
            System.out.println(num +" is a composite number.");
        }
        else{
            System.out.println(num +" is not a composite number.");
        }
    }
}

/*
A composite number is a number that has more than two factors.

For example, 12 has 6 factors:

1, 2, 3, 4, 6, 12

Therefore, 12 is a composite number.
 */
