package J07_Arrays;

import java.util.Scanner;

public class C03_PrintNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" Elements: ");

        for(int i = 0; i < size; i++) {
            System.out.print("Enter element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
