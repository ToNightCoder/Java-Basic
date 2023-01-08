/*Access the Elements of an Array
You can access an array element by referring to the index number.

This statement accesses the value of the first element in cars:
Access the Elements of an Array
You can access an array element by referring to the index number.

This statement accesses the value of the first element in cars: */
public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[1] = "Opel";
        System.out.println(cars[1]); // Now outputs Opel instead of BMW
        System.out.println(cars.length);//Array length


      }
    }
    