package J06_Methods;

public class C04_UserDefinedMethod {
    public static void Ayaan(){

        // User-defined method
        System.out.println("This is user-defined method");
    }
    public static void main(String[] args) {
        System.out.println("Main method start");

        //calling the user-defined method
        Ayaan();

        System.out.println("Main method ends");
    }
}

/*
    Ayaan() is a user-defined method because
    we have created it ourselves.

    public  -> The method can be accessed from anywhere.
    static  -> We can call the method without creating an object.
    void    -> The method does not return any value.

    We call the method inside the main() method by writing:
    greet();
*/
