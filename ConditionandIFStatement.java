/*Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed*/

public class ConditionandIFStatement {

    public static void main(String[] args) {
        int time = 22;
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 18) {
          System.out.println("Good day.");
        }  else {
          System.out.println("Good evening.");
        }
      }
    }
    
