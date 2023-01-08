
    /*Break and Continue in While Loop
You can also use break and continue in while loops: */
public class Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
          if (i == 4) {
            i++;
            continue; //it will skip 4 and print 
          }
          System.out.println(i);
          i++;
        }  
      }
    }
    