public class DefaultAttributes {
    String fname = "John";
    String lname = "Doe";
    String email = "john@doe.com";
    int age = 24;

    public static void main(String[] args){
        DefaultAttributes myObj = new DefaultAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
