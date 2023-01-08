/*Break and Continue in While Loop
You can also use break and continue in while loops: */
public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
          System.out.println(i);
          i++;
          if (i == 4) { //it will break at 3
            break;
          }
        }  
      }
    }
    
