package J03_Conditionals;
import java.util.Scanner;
public class C04_FourDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if(number > 999 && number < 10000){
            System.out.println("4 digit number");
        }
        else{
            System.out.println("The number is not a 4 digit number");
        }

    }
}
