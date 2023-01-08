/*Using Multiple Classes
 You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:

Main.java
Second.java
Main.java */
public class OopsUsingMultipleClasses {
    //Main.java - Class1
public class Main {
  int x = 5;
}
//Second.java -Class2
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
    
}
