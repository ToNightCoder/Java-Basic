/*Parameters and Arguments
Information can be passed to methods as parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name: */
public class MethodParameters {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
      }
    
      public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
      }
    }
    
