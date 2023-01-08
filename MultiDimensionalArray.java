/*Multidimensional Arrays
A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces: */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);  
       
        //Change Element Values
        //You can also change the value of an element:
            int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
            myNumbers1[1][2] = 9;
            System.out.println(myNumbers1[1][2]); // Outputs 9 instead of 7

            /*Loop Through a Multi-Dimensional Array
            We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):*/
            
      
                int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
                for (int i = 0; i < myNumbers2.length; ++i) {
                  for(int j = 0; j < myNumbers2[i].length; ++j) {
                    System.out.println(myNumbers2[i][j]);
                  }
                }
              }
            }
        
        
      
    
    
    
