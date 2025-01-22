public class AbstractClass {
    public static void main(String[] args){
        //Create an object of the student class (which inherits attributes and methods from the Person class)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.getYear());
        myObj.study(); // call abstract method
    }
}
