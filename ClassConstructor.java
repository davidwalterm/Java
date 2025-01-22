public class ClassConstructor {
    int x;

    //Create class concstructor for the main class
    public ClassConstructor(){
        x = 5;
    }

    public static void main(String[] args){
        ClassConstructor myObj = new ClassConstructor();
        System.out.println(myObj.x);
    }
}
