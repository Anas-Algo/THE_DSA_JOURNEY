package J06_Methods;

import java.util.Scanner;

public class C08_MaxOfThreeNumWithReturntype {

    public static int max(int a, int b, int c){
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int result = max(a,b,c);

        System.out.println("Max value is "+result);
    }
}
