/*If you don't want the ability to override existing values, declare the attribute as final:*/



public class OopsFinal {
    //int y = 10;
    final int y = 11;

    public static void main(String[] args) {
        OopsFinal myObj = new OopsFinal();
      myObj.y = 25; // will generate an error: cannot assign a value to a final variable
      System.out.println(myObj.y);
    }
  }

