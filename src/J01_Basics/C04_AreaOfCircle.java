package J01_Basics;

import java.util.Scanner;
public class C04_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double radius = sc.nextDouble();
        double PI = 3.14;
        double AreaofCircle = PI*radius*radius;
        System.out.println("Area of Circle: "+AreaofCircle);
    }
}
