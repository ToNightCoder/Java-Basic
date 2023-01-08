/*Method Overloading
With method overloading, multiple methods can have the same name with different parameters: */
public class MethodOverloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
      }
      
      static double plusMethodDouble(double x, double y) {
        return x + y;
      }
      //Instead of defining two methods that should do the same thing, it is better to overload one.
      //In the example below, we overload the plusMethod method to work for both int and double:
      public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
      }
    
}
