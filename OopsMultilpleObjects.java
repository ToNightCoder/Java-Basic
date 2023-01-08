/* Multiple Objects
If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:

Example
Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:*/
public class OopsMultilpleObjects {
    int x = 5;

    public static void main(String[] args) {
      OopsMultilpleObjects myObj1 = new OopsMultilpleObjects();  // Object 1
      OopsMultilpleObjects myObj2 = new OopsMultilpleObjects();  // Object 2
      myObj2.x = 25;
      System.out.println(myObj1.x);  // Outputs 5
      System.out.println(myObj2.x);  // Outputs 25
    }
  }

