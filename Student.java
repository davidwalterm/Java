public class Student extends Person{
    private int graduationYear = 2018;

    public int getYear(){
        return this.graduationYear;
    }

    public void study(){
        System.out.println("Studying all day long");
    }
}