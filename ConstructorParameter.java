   /* Constructor Parameters
Constructors can also take parameters, which is used to initialize attributes.

The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5: */


public class ConstructorParameter {
  int x;

  public ConstructorParameter(int y) {
    x = y;
  }

  public static void main(String[] args) {
    ConstructorParameter myObj = new ConstructorParameter(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
