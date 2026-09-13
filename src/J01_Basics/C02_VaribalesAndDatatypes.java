package J01_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class C02_VaribalesAndDatatypes {
    public static void main(String[] args) {

        // Variables and Data Types

        // Integer
        int age = 20;

        // Decimal
        double height = 5.8;

        // Character
        char grade = 'A';

        // Boolean
        boolean isStudent = true;

        // String
        String name = "Anas";

        // Float
        float marks = 85.5f;

        // Long
        long population = 1400000000L;

        // Byte
        byte number = 100;

        // Short
        short year = 2026;

        // Printing values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Marks: " + marks);
        System.out.println("Population: " + population);
        System.out.println("Byte Number: " + number);
        System.out.println("Year: " + year);

        // Taking input using Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        String userName = sc.nextLine();

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        System.out.println("\nYour name is: " + userName);
        System.out.println("Your age is: " + userAge);

        sc.close();
    }
}