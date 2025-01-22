public class ParametersConstructor {
    int modelYear;
    String modelName;

    public ParametersConstructor(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args)
    {
        ParametersConstructor myCar = new ParametersConstructor(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
