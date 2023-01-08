/*Return Values
The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method: */
public class MethodReturnValues {
    static int myMethod(int x) {
        return 5 + x; 
      }
      static int myMethod1(int z, int y) {
        return z + y;
      }
      public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethod1(5, 6)); //This example returns the sum of a method's two parameters:
        int a = myMethod1(5, 9);  //You can also store the result in a variable (recommended, as it is easier to read and maintain):
        System.out.println(a);
    
      }
    }
    


