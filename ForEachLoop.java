/*For-Each Loop
There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

Syntax
for (type variableName : arrayName) {
  // code block to be executed
} */
public class ForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
        }    
      }
    }
    