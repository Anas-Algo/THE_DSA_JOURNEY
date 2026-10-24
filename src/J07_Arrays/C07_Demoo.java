package J07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Demoo {
    public static void main(String[] args) {
        int[] arr = {20,30,40,50};
        int key = 30;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("element found at "+i+" index!");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found!");
        }
    }
}
