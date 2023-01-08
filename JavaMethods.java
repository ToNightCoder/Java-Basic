/*Java Methods
A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.

Create a Method
A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions: */ 
public class JavaMethods {
        static void myMethod() {  //creating a method
          System.out.println("I just got executed!");
        }
      
        public static void main(String[] args) {
          myMethod();  //calling a method
          myMethod();  //A method can also be called multiple times:
          myMethod(); 
        }
      }
      
