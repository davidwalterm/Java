// Using static variable inside a class
import java.io.*;

class Test{
    // static variable in Test class
    static int var = 10;
}

public class StaticVariableClass {
    public static void main(String[] args){
        // accessing the static variable
        System.out.println("Static Variable: " + Test.var);
    }
    
}
