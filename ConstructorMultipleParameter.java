//You can have as many parameters as you want:


public class ConstructorMultipleParameter {
  int modelYear;
  String modelName;

  public ConstructorMultipleParameter(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    ConstructorMultipleParameter myCar = new ConstructorMultipleParameter(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang

