/* Multiple Attributes
You can specify as many attributes as you want:*/
public class OopsMultipleAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
  
    public static void main(String[] args) {
      OopsMultipleAttributes myObj = new OopsMultipleAttributes();
      System.out.println("Name: " + myObj.fname + " " + myObj.lname);
      System.out.println("Age: " + myObj.age);
    }
  }

