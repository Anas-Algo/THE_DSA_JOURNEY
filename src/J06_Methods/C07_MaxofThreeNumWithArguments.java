package J06_Methods;

public class C07_MaxofThreeNumWithArguments {
    public static void max(int a, int b, int c){

        if (a >= b && a >= c) System.out.println("a is max value");
        else if (b >= a && b >= c) System.out.println("b is max value");
        else System.out.println("c is max value");

    }
    public static void main(String[] args) {
        max(6,5,4); // Argument
    }
}
