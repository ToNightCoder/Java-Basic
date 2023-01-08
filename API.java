
   /*Import a Class
If you find a class you want to use, for example, the Scanner class, which is used to get user input, write the following code:

Example
import java.util.Scanner;
In the example above, java.util is a package, while Scanner is a class of the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read a complete line: */
   import java.util.Scanner;

    public class API {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
    
