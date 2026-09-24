package J07_Arrays;

import java.util.Scanner;

public class C04_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("=== Enter Array Elements === ");

        for(int i = 0; i < size; i++){
            System.out.print("Enter element at "+i+" index: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum of all elements in the array: "+sum);
    }
}
