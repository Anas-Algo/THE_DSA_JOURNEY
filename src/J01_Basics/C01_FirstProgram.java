package J01_Basics;

/*
 * Package:
 * A package is used to organize related Java classes.
 * It works like a folder that keeps similar classes together.
 */
public class C01_FirstProgram {

    /*
     * public -> Makes the method accessible from outside the class.
     *
     * static -> Allows Java to call the method without creating
     *           an object of the class.
     *
     * void -> Means the method does not return any value.
     *
     * main -> The starting point of a Java program.
     *
     * String[] args -> Stores command-line arguments passed
     *                  to the program.
     */
    public static void main(String[] args) {

        /*
         * System -> A built-in Java class used to interact
         *           with the system.
         *
         * out -> Represents the standard output stream (console).
         *
         * println() -> Prints the given text and moves the cursor
         *              to the next line.
         */
        System.out.println("Hello, World-My first program in java.");

        // Prints a message on the console.
        System.out.print("My Java + DSA journey begins.");
    }
}
