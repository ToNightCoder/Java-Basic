/* Java - What is OOP?
OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.
* Java - What are Classes and Objects?
Classes and objects are the twoOops aspects of object-oriented programming.
*/
//Create a class named "Oops" with a variable x:
public class Oops {
  int x = 5;
  


    
        public static void main(String[] args) {
            Oops myObj = new Oops();
            System.out.println(myObj.x);
            //You can create multiple objects of one class:
         Oops myObj1 = new Oops();  // Object 1
          Oops myObj2 = new Oops();  // Object 2
          System.out.println(myObj1.x);
          System.out.println(myObj2.x);
        }
      }
  
    

