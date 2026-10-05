package J07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_MinimumElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("===Enter Array Elements===");

        for(int i = 0; i < size; i++){
            System.out.print("Enter Array Element at "+i+" index: ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i = 0; i < size; i++){
            if( arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element in Array: "+min);
    }
}
