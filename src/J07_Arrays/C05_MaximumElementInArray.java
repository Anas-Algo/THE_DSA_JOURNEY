package J07_Arrays;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class C05_MaximumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("=== Enter Array Elements ===");

        for(int i = 0; i < size; i++){
            System.out.print("Enter element at "+i+" index: ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 0; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array: "+max);
    }
}
